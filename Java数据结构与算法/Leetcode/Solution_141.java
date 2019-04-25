
public class Solution_141 {
    public boolean hasCycle(ListNode head) {
        if (head==null){
            return false;
        }
        ListNode first = head;
        ListNode Second = head;
        while (Second.next!=null&&Second!=null){
            if (first==Second.next){
                return true;
            }
            first=first.next;
            Second=Second.next.next;
        }
        return false;
    }
}
