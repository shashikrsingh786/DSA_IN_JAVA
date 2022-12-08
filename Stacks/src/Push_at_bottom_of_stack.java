import java.util.Stack;

public class Push_at_bottom_of_stack {
    public static void pushAtBottom(Stack<Integer> sc, int val) {
        if(sc.isEmpty()) {
            sc.push(val);
            return;
        }
        int top = sc.pop();
        pushAtBottom(sc,val);
        sc.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> sc = new Stack<>();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        pushAtBottom(sc,4);
        while(!sc.isEmpty()) {
            System.out.println(sc.peek());
            sc.pop();
        }
    }
}
