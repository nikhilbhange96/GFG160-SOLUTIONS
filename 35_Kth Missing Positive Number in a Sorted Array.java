class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int n=arr.length;
        int left=0,right=n-1;
        int ans=n+k;
        
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>mid+k){
                ans=mid+k;
                right=mid-1;
               
            }
            else{
                 left=mid+1;
            }
        }
        return ans;
    }
}
