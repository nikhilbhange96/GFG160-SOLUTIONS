class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer> hst=new HashSet();
        for(int i:a){
            hst.add(i);
        }
        for(int i:b){
            hst.add(i);
        }
        return hst.size();
    }
}
