class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode q = new ListNode(0); // Create a dummy node to hold the merged list
        ListNode x = q;
        int sum = 0;

        while (temp != null) {
            if (temp.val == 0) {
                x.next = new ListNode(sum);
                x = x.next;
                sum = 0;
            }
            sum = sum + temp.val;
            temp = temp.next;
        }
        return q.next;
    }
}
