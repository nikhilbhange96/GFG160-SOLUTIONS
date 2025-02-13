/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    static void inorderTraversal(Node root, ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        inorderTraversal(root.left,inorder);
        
        inorder.add(root.data);
        
        inorderTraversal(root.right,inorder);
    }
    boolean findTarget(Node root, int target) {
        // Write your code here
        ArrayList<Integer> inorder=new ArrayList();
        inorderTraversal(root,inorder);
        
        int left=0, right=inorder.size()-1;
        
        while(left<right){
            int currSum=inorder.get(left)+inorder.get(right);
            
            if(currSum==target){
                return true;
            }
            if(currSum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
}
