package 数据结构相关.链表;
 class ListNode {
    int val;
     ListNode next;
    ListNode(int x) { val = x; }
 }
public class Solution_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp!=null&&temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
                continue;
            }
            temp = temp.next;
        }
        return head;
    }
}
