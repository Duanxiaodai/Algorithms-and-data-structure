import java.util.ArrayList;
class ListNode {
        int val;
        ListNode next = null;

         ListNode(int val) {
            this.val = val;
        }
  }
public class Solution_6 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode==null){
            return new ArrayList<>();
        }
        else{
            ArrayList <Integer> list = new ArrayList<>();
            list.addAll(printListFromTailToHead(listNode.next));
            list.add(listNode.val);
            return list;
        }
    }
}
