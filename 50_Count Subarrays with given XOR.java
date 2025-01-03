class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        Map<Integer,Integer> mp=new HashMap();
        long count=0;
        int curr=0;
        mp.put(0,1);
        for(int i:arr){
            curr=curr^i;
            if(mp.containsKey(curr^k)){
                count+=mp.get(curr^k);
            }
            mp.put(curr,mp.getOrDefault(curr,0)+1);
        }
        return count;
    }
}
