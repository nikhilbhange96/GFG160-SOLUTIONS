class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        ArrayList<Integer> res=new ArrayList();
        int r=mat.length;
        int c=mat[0].length;
        int top=0,bot=r-1;
        int left=0,right=c-1;
        int d=0;
        
        while(top<=bot && left<=right){
            switch(d){
                case 0:
                    for(int i=left; i<=right; i++){
                        res.add(mat[top][i]);
                    }
                    top++;
                    break;
                case 1:
                    for(int i=top; i<=bot;i++){
                        res.add(mat[i][right]);
                    }
                    right--;
                    break;
                case 2:
                    for(int i=right; i>=left; i--){
                        res.add(mat[bot][i]);
                    }
                    bot--;
                    break;
                case 3:
                    for(int i=bot; i>=top; i--){
                        res.add(mat[i][left]);
                    }
                    left++;
                    break;
            }
            if(d==3){
                d=0;
            }
            else{
                d++;
            }
        }
        return res;
    }
}
