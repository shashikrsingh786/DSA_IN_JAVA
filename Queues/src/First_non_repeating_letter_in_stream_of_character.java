import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class First_non_repeating_letter_in_stream_of_character {
    public static void main(String[] args) {
        String str = "aabccxb";
        System.out.println(Arrays.toString(firstNonRepeat(str)));
    }
    public static char[] firstNonRepeat(String str) {
        Queue<Character> q = new LinkedList<>();
        char[] result = new char[str.length()];
        int[] map = new int[26];
        for(int i = 0; i<str.length();i++) {
            char ch = str.charAt(i);
            q.add(ch);
            map[ch-'a']++;
            while(!q.isEmpty() && map[q.peek()-'a']>1) {
                q.remove();
            }
            if(q.isEmpty()) result[i] = '@';
            else result[i] = q.peek();
        }
        return result;
    }
}
