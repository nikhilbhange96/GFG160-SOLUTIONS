class Solution {
    // Function to count inversions in the array.
      static int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;    
        int j = mid + 1; 
        int k = left;    
        int invCount = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                
                invCount += (mid + 1 - i);
            }
        }

       
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    }

    
     static int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        int invCount = 0;
        if (left < right) {
            int mid = (left + right)/ 2;

           
            invCount += mergeSortAndCount(arr, temp, left, mid);

        
            invCount += mergeSortAndCount(arr, temp, mid + 1, right);

            
            invCount += mergeAndCount(arr, temp, left, mid, right);
        }
        return invCount;
    }
    static int inversionCount(int arr[]) {
        // Your Code Here
            int[] temp = new int[arr.length];
        return mergeSortAndCount(arr, temp, 0, arr.length - 1);
    
    }
}