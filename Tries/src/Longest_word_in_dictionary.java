import java.util.logging.LogManager;

public class Longest_word_in_dictionary {
    public static void main(String[] args) {
        String[] arr = {"a","banana","app","appl","ap","apply","apple"};
        for(int i = 0;i<arr.length;i++) {
            insert(arr[i]);
        }
        System.out.println(find(arr));

    }

    static String LongestWord = "";
    public static String find(String[] arr) {
        for(int i = 0;i<arr.length;i++) {
            longestWord(arr[i]);
        }
        return LongestWord;
    }
    public static void longestWord(String str) {
        Node curr = root;
        String newStr = "";
        for(int i = 0;i<str.length();i++) {
            int idx = str.charAt(i)-'a';
            if(curr.children[idx]!=null && curr.children[idx].eow) {
                newStr+= str.charAt(i);
                if(newStr.length()>LongestWord.length()) {
                    LongestWord = newStr;
                }
                else if (newStr.length() == LongestWord.length() &&
                        newStr.compareTo(LongestWord) < 0) {
                    LongestWord = newStr;
                }
            }
            curr = curr.children[idx];
        }

    }
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        Node() {
            for(int i = 0;i<26;i++) {
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word) {
       Node curr = root;
        for(int level = 0;level<word.length();level++) {
            int idx = word.charAt(level)-'a';
            if(curr.children[idx]==null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
}
