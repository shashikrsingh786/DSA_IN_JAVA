import java.util.Arrays;

public class Anagram_check {
    public static void main(String[] args) {
        String str = "raCje";
        String ste = "acre";

        System.out.println(anagram(str,ste));
    }

    static boolean anagram(String str,String ste) {
        boolean result = false;
        String f = str.toLowerCase();
        String s = ste.toLowerCase();
        if(f.length()==s.length()) {
            char[] first = f.toCharArray();
            char[] second = s.toCharArray();
            Arrays.sort(first);
            Arrays.sort(second);
             result = Arrays.equals(first,second);
        }
        return  result;
    }
}
