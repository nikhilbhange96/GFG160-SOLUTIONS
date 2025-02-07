/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    void solve(Node root,ArrayList<Integer> ans){
        if(root==null)return;
        
        solve(root.left,ans);
        ans.add(root.data);
        solve(root.right,ans);
    }
    ArrayList<Integer> inOrder(Node root) {
        // Code
        
        ArrayList<Integer> ans=new ArrayList();
        solve(root,ans);
        return ans;
    }
}
