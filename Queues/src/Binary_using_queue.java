import java.util.*;

public class Binary_using_queue {
    public static void main(String[] args) {
        int n = 5;
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n>0) {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String  s2 = s1;
            q.add(s1+"0");
            q.add(s2+"1");
            n--;
        }
    }
}
