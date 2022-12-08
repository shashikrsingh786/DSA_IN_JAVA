import java.util.ArrayList;
import java.util.Arrays;

public class Group_anagrams_together {
    public static void main(String[] args) {
        String[] arr = {"a"};
        System.out.println(groupAnagram(arr));

    }

    static ArrayList<ArrayList<String>> ans;
    static Node root;

    public static ArrayList<ArrayList<String>> groupAnagram(String[] arr) {

        ans = new ArrayList<>();
        root = new Node();

        for (String s : arr) {
            build(s);          // inserting in sorting order in tries
        }

        dfs(root);

        return ans;

    }
    public static void build(String str)  {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        Node curr = root;
        for(int i = 0;i<ch.length;i++) {
            int idx = ch[i]-'a';
            if(curr.children[idx]==null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
        curr.data.add(str);
    }

    public static void dfs(Node root) {
        if(root.eow) {
            ans.add(root.data);
        }
        for(int i = 0;i<26;i++) {
            if(root.children[i]!=null) {
                dfs(root.children[i]);
            }
        }
    }
    static class Node {
        Node[] children;
        ArrayList<String> data;
        boolean eow;

        Node() {
            children = new Node[26];
            data = new ArrayList<>();
            eow = false;
        }
    }

}
