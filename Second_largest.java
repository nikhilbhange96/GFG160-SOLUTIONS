class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int large =arr[0];
        int large2 =-1;
        int n= arr.length;
        
        for(int i=1; i<n; i++){
            
            if(arr[i] > large){
                large2 = large;
                large = arr[i];
            }
            else if(arr[i] > large2 && arr[i] != large){
                large2 = arr[i];
            }
        }
        return large2;
    }
}
