//Time Complexity O(n)
//Space Complexity O(1)

public class LinkedListCycle_2 {
    public ListNode detectCycle(ListNode head) {

        if (head == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;

    }

}
