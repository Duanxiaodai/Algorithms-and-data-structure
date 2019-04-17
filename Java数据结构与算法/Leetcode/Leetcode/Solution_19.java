

 class ListNode {
     int val;
     ListNode next;
    ListNode(int x) { val = x; }
}

class Solution_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp0 = head;
        ListNode temp1 = head;

        while(n>0){
            n--;
            temp0=temp0.next;
        }
//        boolean flag = true;
        while(temp0!=null&&temp0.next!=null){
            temp0 = temp0.next;
            temp1 = temp1.next;
//            flag = false;
        }

        if (temp1.next==null){
            return null;
        }
        if (temp0==null){
            return head.next;
        }

        temp1.next=temp1.next.next;
        return head;
    }
}