class Solution {
    int countFreq(int[] arr, int target) {
        // code here\
        int n=arr.length;
        int frq=0;
        for(int i=0; i<n; i++){
            if(arr[i]==target){
                frq++;
            }
        }
        return frq;
    }
}
