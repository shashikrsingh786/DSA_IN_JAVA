import java.util.Stack;

public class Stacks_using_JCF {
    public static void main(String[] args) {
        Stack<Integer> sc = new Stack<>();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        while(!sc.isEmpty()) {
            System.out.println(sc.peek());
            sc.pop();
        }
    }
}
