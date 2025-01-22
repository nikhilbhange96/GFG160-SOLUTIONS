
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node next;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static int countNodes(Node head){
        Node curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
    static Node trimLeadingZeros(Node head){
        while(head!=null &&head.data==0){
            head=head.next;
        }
        return head;
    }
    
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        num1=trimLeadingZeros(num1);
        num2=trimLeadingZeros(num2);
        
       
        int carry=0;
        num1=reverse(num1);
        num2=reverse(num2);
       
        Node ans= new Node(0);
        Node curr=ans;   
        while(num1!=null || num2!=null || carry!=0){
            int sum=carry;
            if(num1!=null){
                sum+=num1.data;
                num1=num1.next;
            }
            if(num2!=null){
                sum+=num2.data;
                num2=num2.next;
            }
           
            carry=sum/10;
            curr.next=new Node(sum%10);
            curr=curr.next;
            
            
           
        }
        Node res=reverse(ans.next);
        return trimLeadingZeros(res);
    }
}
