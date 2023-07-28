class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return head;

        ListNode temp = head;
        ListNode temp2 = head.next;
        ListNode nxt = head.next;

        while (temp.next != null && temp2.next != null) {
            temp.next = temp.next.next;
            temp = temp.next;
            temp2.next = temp2.next.next;
            temp2 = temp2.next;
        }

        temp.next = nxt;
        return head;
    }
}
