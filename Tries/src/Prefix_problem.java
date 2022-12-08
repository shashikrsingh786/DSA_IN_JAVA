import java.util.ArrayList;

public class Prefix_problem {
    public static void main(String[] args) {
        String[] arr = {"zebra","dog","duck","dove"};
        for(int i = 0;i<arr.length;i++) {
            insert(arr[i]);
        }
        root.frequency = -1;

        ans = new ArrayList<>();

        for(int i = 0;i<arr.length;i++) {
            prefix(arr[i]);
        }

        System.out.println(ans);
    }
    public static void prefix(String word) {
        Node curr = root;
        String newStr = "";
        for(int i = 0;i<word.length();i++) {
            int idx = word.charAt(i)-'a';
            newStr+= word.charAt(i);
            if(curr.children[idx].frequency==1) {
                break;
            }
            curr = curr.children[idx];
        }
        ans.add(newStr);
    }

    static ArrayList<String> ans;
    public static boolean search(String str) {
        Node curr = root;
        for(int i =0;i<str.length();i++) {
            int idx = str.charAt(i)-'a';
            if(curr.children[idx]!=null) {
                curr = curr.children[idx];
            }
            else return false;
        }
        if(curr.eow) return true;
        return false;
    }
    static class Node {
        Node[] children =  new Node[26];
        boolean eow = false;
        int frequency = 1;

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
            else {
                curr.children[idx].frequency++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
}
