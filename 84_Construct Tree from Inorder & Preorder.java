/*
class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}
*/

class Solution {
    static int pos;
    static Node solve(int[] inorder,int []preorder,int st,  int end){
        if(st > inorder.length ||st > end){
            return null;
        }
        Node root=new Node(preorder[pos]);
        int div=0;
        for(int i=st; i<=end; i++){
            if(preorder[pos]==inorder[i]){
                div=i;
                break;
            }
        }
        pos++;
        root.left=solve(inorder,preorder,st,div-1);
        root.right=solve(inorder,preorder,div+1,end);
        return root;
    }
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        pos=0;
        return solve(inorder,preorder,0,inorder.length-1);
    }
}
