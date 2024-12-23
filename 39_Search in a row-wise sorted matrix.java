class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
     for(int i=0; i<mat.length; i++){
         int l=0,r=mat[0].length-1;
         while(l<=r){
             int mid=(l+r)/2;
             if(mat[i][mid]==x){
                 return true;
             }
             if(mat[i][mid]<x){
                 l=mid+1;
             }
             else{
                 r=mid-1;
             }
         }
     }
        return false;
    }
}
