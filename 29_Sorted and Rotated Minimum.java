class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int n= arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
