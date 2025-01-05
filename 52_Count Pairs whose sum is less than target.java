class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        int n=arr.length;
        int count=0;
        int i=0,j=n-1;
        Arrays.sort(arr);
        while(i<j){
            if(arr[i]+arr[j]<target){
                count+=(j-i);
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }
}
