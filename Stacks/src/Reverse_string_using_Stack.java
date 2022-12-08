import java.util.Stack;

public class Reverse_string_using_Stack {
    public static void main(String[] args) {
        String str = "abcd";
       String rev = reverseString(str);
        System.out.println(rev);
    }
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        while(i<str.length()) {
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()) {
            result.append(s.pop());
        }
        return result.toString();
    }
}
