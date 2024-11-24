class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        
        int n= arr.length;
        int maxSum=arr[0];
        int curr=0;
        
        for(int i:arr){
            curr=Math.max(curr+i,i);
            maxSum= Math.max(maxSum,curr);
            
        }
        return maxSum;
    }
}
