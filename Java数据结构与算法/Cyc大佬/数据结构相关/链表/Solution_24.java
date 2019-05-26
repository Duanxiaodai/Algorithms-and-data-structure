package 数据结构相关.链表;

public class Solution_24 {
    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode temp = head.next.next;
        head.next.next = head;
        ListNode temp2 = head.next;
        head.next = swapPairs(temp);
        return temp2;
    }

}
