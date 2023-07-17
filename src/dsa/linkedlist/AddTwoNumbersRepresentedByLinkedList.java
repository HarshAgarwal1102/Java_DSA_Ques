class AddTwoNumbersRepresentedByLinkedList{
    public static Node reverse(Node head){
        Node next = null;
        Node pre = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        
        Node temp1 = reverse(first);
        Node temp2 = reverse(second);
        Node dummy = new Node(-1);
        Node ans = dummy;
        int carry = 0;

        while(temp1 != null && temp2 != null){
            int sum =0;
            sum = temp1.data + temp2.data + carry;
            dummy.next = new Node(sum%10);
            carry = sum/10;
            temp1= temp1.next;
            temp2 = temp2.next;
            dummy = dummy.next;
        }

        while(temp1 != null){
            int sum =0;
            sum = temp1.data + carry;
            dummy.next = new Node(sum%10);
            carry = sum/10;
            temp1= temp1.next;
            dummy = dummy.next;
        }
        while(temp2 != null){
            int sum =0;
            sum = temp2.data + carry;
            dummy.next = new Node(sum%10);
            carry = sum/10;
            temp2= temp2.next;
            dummy = dummy.next;
        }
        if(carry > 0){
            dummy.next = new Node(carry);
            dummy = dummy.next;
        }

        return reverse(ans.next);
    }
}
