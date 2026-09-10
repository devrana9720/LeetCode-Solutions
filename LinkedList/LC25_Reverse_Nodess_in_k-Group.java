class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (true) {

            ListNode curr = prev;

            for (int i = 0; i < k; i++) {
                curr = curr.next;

                if (curr == null) {
                    return dummy.next;
                }
            }

            ListNode groupStart = prev.next;
            ListNode nextGroup = curr.next;

            curr.next = null;

            prev.next = reverse(groupStart);

            groupStart.next = nextGroup;

            prev = groupStart;
        }
    }

    private ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}