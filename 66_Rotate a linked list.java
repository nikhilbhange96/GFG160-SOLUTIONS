class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        Node current=head;
        int n=1;
        
        while(current.next!=null){
            current=current.next;
            n++;
        }
        k%=n;
        
        if(k==0){
            return head;
        }
        current.next=head;
        current=head;
        for(int i=1; i<k; i++){
            current=current.next;
        }
        head=current.next;
        current.next=null;
        
        return head;
    }
}
