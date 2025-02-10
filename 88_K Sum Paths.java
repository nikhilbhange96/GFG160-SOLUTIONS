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
    Map<Integer,Integer> mp=new HashMap();
    int count=0;
    void dfs(Node root, int k, int sum){
        if(root==null)return;
        
        sum+=root.data;
        if(mp.containsKey(sum-k)){
            count+=mp.get(sum-k);
        }
        mp.put(sum,mp.getOrDefault(sum,0)+1);
        
        dfs(root.left,k,sum);
        
        dfs(root.right,k,sum);
        
        mp.put(sum,mp.get(sum)-1);
        
        if(mp.get(sum)==0){
            mp.remove(sum);
        }
        
    }
    public int sumK(Node root, int k) {
        // code here
        mp.put(0,1);
        dfs(root,k,0);
        return count;
    }
}
