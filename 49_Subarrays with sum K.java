class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        int ans=0;
        int sum=0;
        Map<Integer,Integer> mp= new HashMap();
        mp.put(0,1);
        for(int i:arr){
            sum+=i;
            if(mp.containsKey(sum-k)){
                ans+=mp.get(sum-k);
            }
            mp.put(sum, mp.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
