import java.util.Stack;

public class Duplicate_parentheses {
    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        System.out.println(isDuplicateParentheses(str));
    }
    public static boolean isDuplicateParentheses(String str) {
        Stack<Character> s = new Stack<>();
        for(int i = 0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch==')') {
                int count = 0;
                while(s.peek()!='(')  {        // opening pair finding
                    s.pop();
                    count++;
                }
                if(count<1) return true;              // duplicate found
                else s.pop();
            }
            else s.push(ch);             // opening
        }
        return false;
    }
}
