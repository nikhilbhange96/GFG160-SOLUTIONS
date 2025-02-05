/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Your code here
        if(node==null)return ;
        
        Node temp=node.right;
        node.right=node.left;
        node.left=temp;
        
        mirror(node.right);
        mirror(node.left);
    }
}
