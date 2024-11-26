class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
        
        int n= arr.length;
        if(n==1){
            return arr[0];
        }
        int Max =arr[0];
        int Min =arr[0];
        int currMax= 0;
        int currMin= 0;
        int total= 0;
        int ans=0;
        
        for(int i=0; i<n; ++i){
            int num= arr[i];
            
            currMax=Math.max(currMax+num, num);
            Max=Math.max(Max,currMax);
            
            currMin=Math.min(currMin+num,num);
            Min=Math.min(Min,currMin);
            
            total+=num;
            
            ans=Math.max(Max,total-Min);
            
        }
        if(Max<0){
            return Max;
        }
      
        return ans;
        
        
        
    }
}
