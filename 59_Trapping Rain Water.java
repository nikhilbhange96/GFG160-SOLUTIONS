class Solution {
    public int maxWater(int arr[]) {
        // code here
        int st=0, end=arr.length-1;
        int maxWater=0,lmax=0,rmax=0;
        while(st<end){
            if(arr[st]<=arr[end]){
                if(lmax<arr[st]){
                    lmax=arr[st];
                }
                else{
                    maxWater+=lmax-arr[st];
                }
                st++;
            }
            else{
                if(rmax<arr[end]){
                    rmax=arr[end];
                }
                else{
                    maxWater+=rmax-arr[end];
                }
                end--;
                
            }
            
        }
        return maxWater;
    }
}
