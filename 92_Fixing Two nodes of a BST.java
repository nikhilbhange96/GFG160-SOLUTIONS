
/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static void findInorder(Node curr, ArrayList<Integer> inorder){
        if(curr==null){
            return ;
        }
        findInorder(curr.left,inorder);
        inorder.add(curr.data);
        findInorder(curr.right,inorder);
    }
    static void correctBSTUtil(Node root, ArrayList<Integer>inorder, int[] index){
        if(root==null){
            return;
        }
        correctBSTUtil(root.left,inorder,index);
        
        root.data=inorder.get(index[0]);
        index[0]++;
        
        correctBSTUtil(root.right,inorder,index);
    }
    void correctBST(Node root) {
        // code here.
        ArrayList<Integer> inorder=new ArrayList();
        findInorder(root, inorder);
        
        Collections.sort(inorder);
        
        int[]index={0};
        correctBSTUtil(root,inorder,index);
    }
}
