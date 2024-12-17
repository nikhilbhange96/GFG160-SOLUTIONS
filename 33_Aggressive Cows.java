class Solution {
    
    static boolean isPossible(int[] stalls,int k,int mid){
        int count=1;
        int last=stalls[0];
        int n=stalls.length;
        for(int i=1; i<n; i++){
            if(stalls[i]-last>=mid){
                count++;
                last=stalls[i];
            }
        }
        return (count>=k);
        
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        int n=stalls.length;
        Arrays.sort(stalls);
        int low=0;
        int high=stalls[n-1]-stalls[0];
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(stalls,k,mid)){
                ans=mid;
                low=mid+1;
                
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
