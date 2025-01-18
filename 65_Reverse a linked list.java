class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev=null;
        Node current=head;
        Node next=null;
        
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}
