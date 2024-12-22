class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int n= mat.length;
        int i=0; int j=mat[0].length-1;
        while (i<n && j>=0){
            if(mat[i][j]==x)
                return true;
            
            if(mat[i][j]>x){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
        
        
        // int rows=mat.length;
        // int cols=mat[0].length;
        // boolean check=false;
        // for(int i=0; i<rows; i++){
        //     for(int j=0;  j<cols; j++){
        //         if(mat[i][j]==x){
        //             check=true;
        //         }
        //     }
        // }
        // return check;
    }
}
