import java.util.ArrayList;
import java.util.Stack;

public class Topological_sorting_DAG {
    public static void main(String[] args) {
        int  v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i = 0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

        topSort(graph);
    }
    public static void topSort(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i = 0;i<graph.length;i++){
            if(!vis[i]) {
                topSortUtil(graph,i,vis,s);   // modified dfs
            }
        }
        while(!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }

    private static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> s) {
        for(int j = 0;j<graph[j].size();j++) {
            Edge e = graph[curr].get(j);
            if(!vis[e.dest]) {
                topSortUtil(graph,e.dest,vis,s);
            }
        }
        s.push(curr);
    }

    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
}
