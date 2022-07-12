import java.util.List;

class ListNode {
    int value = 0;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}
class Solution {
    public static boolean findCycleStart(int[] nums) {
        int fast = 0;
        for (int slow = 0; slow < nums.length; slow++){
            int mvFw = nums[fast];
            mvFw = nums.length % (fast + mvFw);
            if (mvFw == slow){
                return true;
            }
        }
        return false;
    }

    public static void rotateList(ListNode head, ListNode middle) {
        ListNode temp = head.next;
        ListNode temp2 = middle.next;
        while (temp2 !=null && temp2.next != null) {
            middle.next = temp;
            head.next = middle;
            head = temp;
            middle = temp2;
        }
    }

    public static ListNode reverseList(ListNode middle) {
        ListNode temp;
        ListNode prev = null;
        while (middle != null && middle.next != null){
            temp = middle.next;
            middle.next = prev;
            prev = middle;
            middle = temp;
        }
        return middle;
    }

    public static void findMiddle(ListNode head) {
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(Solution.findCycleStart(new int[] {2, 1, -1, -2}));
        //System.out.println(" cycle start: " + Solution.findCycleStart(head).value);
        //head.next.next.next.next.next = new ListNode(6);
        //Solution.findCycleStart(head);
        //System.out.println(" cycle start: " + Solution.findCycleStart(head).value);
        //head.next.next.next.next.next.next = new ListNode(7);
        //System.out.println(" cycle start: " + Solution.findCycleStart(head).value);

        //Solution.findCycleStart(head);

//        head.next.next.next.next.next.next = head.next.next;
//        System.out.println(" cycle start: " + Solution.findCycleStart(head).value);
//
//        head.next.next.next.next.next.next = head.next.next.next;
//        System.out.println(" cycle start: " + Solution.findCycleStart(head).value);
//
//        head.next.next.next.next.next.next = head;
//        System.out.println(" cycle start: " + Solution.findCycleStart(head).value);
    }
}