import java.util.Stack;

public class Reverse_stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }
    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()) return;
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    public static void pushAtBottom(Stack<Integer> sc, int val) {
        if(sc.isEmpty()) {
            sc.push(val);
            return;
        }
        int top = sc.pop();
        pushAtBottom(sc,val);
        sc.push(top);
    }
}
