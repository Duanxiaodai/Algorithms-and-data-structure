import java.util.LinkedList;

class MinStack {
    LinkedList<Integer> Stack1 ;
    LinkedList<Integer> Stack2 ;
    public MinStack() {
        Stack1 = new LinkedList();
        Stack2 = new LinkedList();
    }
    public void push(int x) {
        Stack1.push(x);
        if (Stack2.isEmpty()){
            Stack1.push(x);
        }
        else {
            if (Stack2.peek() > x) {
                Stack2.push(x);
            } else {
                Stack2.push(Stack2.peek());
            }
        }
    }
    public void pop() {
        Stack1.pop();
        Stack2.pop();
    }

    public int top() {
        return Stack1.peek();
    }

    public int getMin() {
        return Stack2.peek();
    }
}
public class Solution_155{

}