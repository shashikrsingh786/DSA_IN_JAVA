public class startsWith_problem {
    public static void main(String[] args) {
        String[] arr = {"apple","app","mango","man","woman"};
        String prefix = "moon";
        for(int i = 0;i<arr.length;i++) {
            insert(arr[i]);
        }
        System.out.println(startsWith(prefix));
    }
    public static boolean startsWith(String prefix) {
        Node curr = root;
        for(int i = 0;i<prefix.length();i++) {
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx]==null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
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
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        Node() {
            for(int i = 0;i<26;i++) {
                children[i] = null;
            }
        }
    }
}
