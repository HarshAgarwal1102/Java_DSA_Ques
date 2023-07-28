class Solution {

    private int count1 = 0;

    private int length(ListNode head) {
        int ans = 0;
        ListNode temp = head;
        while (temp != null) {
            ans++;
            temp = temp.next;
        }
        return ans;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null)
            return null;

        count1 = length(head);

        if (count1 < k)
            return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt = curr;

        int count = 0;
        while (curr != null && count < k) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            count++;
        }

        if (nxt != null) {
            head.next = reverseKGroup(nxt, k);
        }

        return prev;
    }
}
