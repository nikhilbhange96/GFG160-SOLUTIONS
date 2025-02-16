/*Complete the given function
Node is as follows:
class Tree{
    int data;
    Tree left,right;
    Tree(int d){
        data=d;
        left=right=null;
    }
}*/

class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList();
        ser(root,ans);
        return ans;
    }
    void ser(Node root,ArrayList<Integer> ans){
        if(root==null){
            ans.add(-1);
            return;
        }
        ans.add(root.data);
        ser(root.left,ans);
        ser(root.right,ans);
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> arr) {
        // code here
        int[]ans={0};
        return deser(arr,ans);
    }
    Node deser(ArrayList<Integer> ans,int[] arr){
        if(arr[0]>ans.size() || ans.get(arr[0])==-1){
            arr[0]++;
            return null;
        }
        Node root=new Node(ans.get(arr[0]++));
        root.left=deser(ans,arr);
        root.right=deser(ans,arr);
        return root;
    }
};
