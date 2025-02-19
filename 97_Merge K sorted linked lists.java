/*class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// arr is an array of Nodes of the heads of linked lists

class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->a.data-b.data);
        for(Node n:arr){
            pq.add(n);
        }
        Node newHead=null,tail=null;
        while(!pq.isEmpty()){
            Node temp=pq.poll();
            if(newHead==null){
                newHead=temp;
                tail=temp;
                
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            if(temp.next!=null){
                pq.add(temp.next);
            }
        }
        return newHead;
    }
}
