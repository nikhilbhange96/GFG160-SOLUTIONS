class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int maxLen=0; int sum=0;
        Map<Integer, Integer> mp=new HashMap();
        mp.put(0,-1);
        
        for(int i =0; i<arr.length; i++){
            sum+=arr[i];
            
            if(mp.containsKey(sum-k)){
                maxLen=Math.max(maxLen,i-mp.get(sum-k));
            }
            mp.putIfAbsent(sum,i);
        }
        return maxLen;
    }
}
