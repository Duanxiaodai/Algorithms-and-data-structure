import java.awt.*;

public class Solution_206 {
    public ListNode reverseList(ListNode head) {
        ListNode pro = head;
        ListNode end = null;
        ListNode mid = head;

        while (pro != null){
            pro = pro.next;
            mid.next = end;
            end =mid;
            mid = pro;
        }

        return end;
    }
}
