class ListNode {
    int value = 0;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}
class Solution {
    public static ListNode findCycleStart(ListNode head) {
        ListNode tPointer = head.next;
        ListNode hPointer = head.next.next;
        while (tPointer.value != hPointer.value) {
            if (tPointer.value == hPointer.value) {
                return head;
            }
           tPointer = head.next;
           hPointer = head.next.next;
       }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        head.next.next.next.next.next.next = head.next.next;
        System.out.println(" cycle start: " + Solution.findCycleStart(head).value);

        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println(" cycle start: " + Solution.findCycleStart(head).value);

        head.next.next.next.next.next.next = head;
        System.out.println(" cycle start: " + Solution.findCycleStart(head).value);
    }
}