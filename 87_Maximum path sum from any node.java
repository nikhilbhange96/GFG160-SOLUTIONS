/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    // Function to return maximum path sum from any node in a tree.
    int maxSum=Integer.MIN_VALUE;
    int pathSum(Node node){
        if(node==null)return 0;
        
        int left=Math.max(0,pathSum(node.left));
        int right=Math.max(0,pathSum(node.right));
        
        maxSum=Math.max(maxSum,left+right+node.data);
        
        return node.data+Math.max(left,right);
    }
    int findMaxSum(Node node) {
        // your code goes here
        pathSum(node);
        return maxSum;
    }
}
