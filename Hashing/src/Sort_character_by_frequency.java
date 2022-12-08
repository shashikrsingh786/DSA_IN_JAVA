
import java.util.*;          // did all by myself

public class Sort_character_by_frequency {
    public static void main(String[] args) {
        String str = "tree";
        str = sort(str);

        System.out.println("character after sorting : " + str);
    }
    public static String sort(String str) {

        String newStr = "";
        TreeMap<Character,Integer> map = new TreeMap<>();
        for(int i = 0;i<str.length();i++) {
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        while(!map.isEmpty()) {
            newStr+=map.firstKey();
            map.put(map.firstKey(),map.get(map.firstKey())-1);
            if(map.get(map.firstKey())==0) {
                map.remove(map.firstKey());
            }
        }
        return newStr;
    }
}
