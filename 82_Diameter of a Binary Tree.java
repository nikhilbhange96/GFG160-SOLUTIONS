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
    int ans=0;
    int calc(Node node){
        if(node==null){
            return 0;
        }
        int left=calc(node.left);
        int right=calc(node.right);
        
        ans=Math.max(ans,left+right);
        
        return Math.max(left,right)+1;
    }
    int diameter(Node root) {
        // Your code here
        calc(root);
        return ans;
    }
}
