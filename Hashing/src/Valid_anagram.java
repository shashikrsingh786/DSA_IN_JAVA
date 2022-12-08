import java.util.HashMap;

public class Valid_anagram {
    public static void main(String[] args) {
        String s = "keen";
        String t = "knee";

        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i = 0;i<s.length();i++) {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i = 0; i<t.length();i++) {
            hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),1)-1);
            if(hm.get(t.charAt(i))==0) {
                hm.remove(t.charAt(i));
            }
        }
        if(hm.isEmpty()) {
            System.out.println("strings are anagrams");
        }
        else {
            System.out.println("strings are not anagrams");
        }
    }
}
