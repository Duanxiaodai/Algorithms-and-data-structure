public class Solution_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int first = 0;
        int second = 0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while (temp1!=null){
            temp1=temp1.next;
            first++;
        }
        while (temp2!=null){
            temp2=temp2.next;
            second++;
        }
        temp1 = headA;
        temp2 = headB;
        if (first<second){
            int sublength = second - first;
            while (sublength>0){
                temp2 = temp2.next;
                sublength--;
            }
        }
        else {
            int sublength =  first - second;
            while (sublength>0){
                temp1 = temp1.next;
                sublength--;
            }
        }
        while (temp1!=null&&temp2!=null){
            if (temp1==temp2){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
}
