class Solution {
    public ListNode swapPairs(ListNode head) {

        // If list has 0 or 1 node
        if (head == null || head.next == null) {
            return head;
        }

        // First two nodes
        ListNode first = head;
        ListNode second = head.next;

        // Swap the pair
        first.next = swapPairs(second.next);
        second.next = first;

        // Second becomes the new head
        return second;
    }
}