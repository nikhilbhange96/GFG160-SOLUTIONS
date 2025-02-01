
class Solution {
    static boolean check(char[][] mat, int i, int j, int idx,String word, boolean[][] visit){
        if(idx==word.length()){
            return true;
        }
        
        
        if(i<0 || j<0 || i>=mat.length || j>=mat[0].length || visit[i][j]|| mat[i][j] !=word.charAt(idx)){
            return false;
        }
        visit[i][j]=true;
        
        if( check(mat,i,j-1,idx+1,word,visit)||
            check(mat,i,j+1,idx+1,word,visit)||
            check(mat,i+1,j,idx+1,word,visit)||
            check(mat,i-1,j,idx+1,word,visit)){
                return true;
            }
        visit[i][j]=false;
        return false;
    }
    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                
                if(mat[i][j]==word.charAt(0)){
                    
                    boolean [][]visit=new boolean[mat.length][mat[0].length];
                    
                    if(check(mat,i,j,0,word,visit)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
