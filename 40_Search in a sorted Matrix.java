class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length,m=mat[0].length;
            int l=0,r=n*m-1;
            while(l<=r){
                int mid=(l+r)/2;
                int i=mid/m;
                int j=mid%m;
                if(mat[i][j]==x){
                    return true;
                }
                if(mat[i][j]<x){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        
        return false;
    }
}
