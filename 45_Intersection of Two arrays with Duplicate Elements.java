class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        Set<Integer> ans= new HashSet();
        for(int i:a){
            ans.add(i);
        }
        ArrayList<Integer> res=new ArrayList();
        for(int i:b){
            if(ans.contains(i)){
                res.add(i);
                ans.remove(i);
            }
        }
        return res;
    }
}
