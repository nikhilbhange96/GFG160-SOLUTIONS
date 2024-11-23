class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n= arr.length;
       
       Arrays.sort(arr);
       
       if(n==1){
           return 0;
       }
       
       int large=arr[n-1]-k;
       int small=arr[0]+k;
       
       int ans=arr[n-1]-arr[0];
       
       for(int i=0; i<n-1; i++){
           
           int max=Math.max(large,arr[i]+k);
           int min=Math.min(small,arr[i+1]-k);
           
           if(min<0){
               continue;
           }
           ans=Math.min(ans,max-min);
       }
       return ans;
    }
}
