/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    static void leftNode(Node node, ArrayList<Integer> ans){
        if(node==null){
            return;
        }
        if(node.left!=null){
            ans.add(node.data);
            leftNode(node.left,ans);
        }
        else if(node.right!=null){
            ans.add(node.data);
            leftNode(node.right,ans);
        }
    }
    void addleaf(Node node, ArrayList<Integer> ans){
        if(node==null)return;
        
        addleaf(node.left,ans);
        if(node.left==null&& node.right==null){
            ans.add(node.data);
        }
        addleaf(node.right,ans);
    }
    void rightRevNode(Node node, ArrayList<Integer> ans){
        if(node==null)return;
        
        if(node.right!=null){
            rightRevNode(node.right,ans);
            ans.add(node.data);
        }
        else if(node.left!=null){
            rightRevNode(node.left,ans);
            ans.add(node.data);
        }
    }
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> ans=new ArrayList();
        
        if(node.left!=null || node.right!=null){
            ans.add(node.data);
        }
        leftNode(node.left,ans);
        addleaf(node,ans);
        rightRevNode(node.right,ans);
        
        return ans;
    }
}
