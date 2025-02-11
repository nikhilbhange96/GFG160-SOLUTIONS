class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBSTutil(Node node, int min, int max){
        if(node==null){
            return true;
        }
        if(node.data <=min || node.data>=max){
            return false;
        }
        return isBSTutil(node.left,min,node.data)&& isBSTutil(node.right, node.data, max);
    }
    boolean isBST(Node root) {
        // code here.
        return isBSTutil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}
