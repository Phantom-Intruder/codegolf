class ListNode {
    int value = 0;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}
class Solution {
    public static boolean findCycleStart(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                return true;
            }
       }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        head.next.next.next.next.next.next = head.next.next;
        System.out.println(" cycle start: " + Solution.findCycleStart(head));

        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println(" cycle start: " + Solution.findCycleStart(head));

        head.next.next.next.next.next.next = head;
        System.out.println(" cycle start: " + Solution.findCycleStart(head));
    }
}