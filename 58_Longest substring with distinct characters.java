class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        
        HashMap<Character,Integer> mp=new HashMap();
        int maxLength=0;
        int st=0;
        for(int end=0; end<s.length(); end++){
            char curr= s.charAt(end);
            
            if(mp.containsKey(curr)){
                st=Math.max(st,mp.get(curr)+1);
            }
            mp.put(curr,end);
            
            maxLength=Math.max(maxLength,end-st+1);
        }
        return maxLength;
    }
}
