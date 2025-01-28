class Solution {
      
    public ArrayList<String> findPermutation(String s) {
        // Code here
        // ArrayList<String> res=new ArrayList();
        
        Set<String> res=new TreeSet();
        
        if(s.length()==0){
            res.add("");
            return new ArrayList(res);
        }
        char firstChar=s.charAt(0);
        String remain=s.substring(1);
        ArrayList<String> words= findPermutation(remain);
        
        for(String word:words){
            for(int i=0; i<=word.length(); i++){
                String pref=word.substring(0,i);
                String suff=word.substring(i);
                
                res.add(pref+firstChar+suff);
            }
        }
        return new ArrayList(res);
    }
}
