
class Solution {
    static void solve(int n,int curr,boolean[]col, boolean[]ndiag,boolean[]rdiag,ArrayList<ArrayList<Integer>> res, ArrayList<Integer> temp){
        if(curr==n){
            res.add(new ArrayList(temp));
            return;
        }
        for(int i=0; i<n; i++){
            if(col[i]==false&& ndiag[curr+i]==false&& rdiag[curr-i+n-1]==false){
                
                temp.add(i+1);
                col[i]=true;
                ndiag[curr+i]=true;
                rdiag[curr-i+n-1]=true;
                
                solve(n,curr+1,col,ndiag,rdiag,res,temp);
                
                temp.remove(temp.size()-1);
                col[i]=false;
                ndiag[curr+i]=false;
                rdiag[curr-i+n-1]=false;
            }
        }
    }
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        boolean[] col=new boolean[n];
        boolean[] ndiag=new boolean[2*n-1];
        boolean[] rdiag=new boolean[2*n-1];
        
        ArrayList<ArrayList<Integer>> res=new ArrayList();
        ArrayList<Integer> temp=new ArrayList();
        
        solve(n,0,col,ndiag,rdiag,res,temp);
        
        return res;
        
    }
}
