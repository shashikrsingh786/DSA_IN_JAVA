import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Alien_dictionary {
    public static void main(String[] args) {
        int N = 5, K = 4;
        String[] dict = {"baa", "abcd", "abca", "cab", "cad"};
        String ans = findOrder(dict, N, K);

        for (int i = 0; i < ans.length(); i++) {
            System.out.print(ans.charAt(i) + " ");
        }
        System.out.println("");
    }
    public static String findOrder(String[] dict, int n, int k) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<k;i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0;i<n-1;i++) {
            String s1 = dict[i];
            String s2 = dict[i+1];
            int len = Math.min(s1.length(),s2.length());
            for(int j = 0;j<len;j++) {
                if(s1.charAt(j)!=s2.charAt(j)) {
                    adj.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
                    break;
                }
            }
        }
        ArrayList<Integer> topo = topSort(adj,k);
        String ans = "";
        for (int it : topo) {
            ans = ans + (char)(it + (int)('a'));
        }

        return ans;


    }
    public static ArrayList<Integer> topSort(ArrayList<ArrayList<Integer>> adj, int K) {
        int[] inDegree = new int[K];

        for (int i = 0; i < K; i++) {
            for (int it : adj.get(i)) {
                inDegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < K; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }
        ArrayList<Integer> topo = new ArrayList<>();
        while(!q.isEmpty()) {
            int node = q.remove();
            topo.add(node);

            for (int it : adj.get(node)) {
                inDegree[it]--;
                if (inDegree[it] == 0) q.add(it);
            }

        }
        return topo;
    }
}
