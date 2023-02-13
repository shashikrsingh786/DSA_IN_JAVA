import java.util.ArrayList;
import java.util.Stack;

public class Strongly_connected_component {
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i=0;i<graph.length;i++ ) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));

        kosaraju(graph,v);
    }
    public static void kosaraju(ArrayList<Edge>[] graph, int V) {
        // step -1
        Stack<Integer> s = new Stack<>();
        boolean[] vis = new boolean[V];
        for(int i = 0;i<V;i++) {
            if(!vis[i]) {
                topSort(graph,i,vis,s);
            }
        }

//        // step - 2
        ArrayList<Edge>[] transpose = new ArrayList[V];
        for(int i = 0;i<transpose.length;i++) {
            vis[i] = false;
            transpose[i] = new ArrayList<>();
        }
        for(int i = 0;i<V;i++) {
            for(int j = 0;j<graph[i].size();i++) {
                Edge e = graph[i].get(j);  // src -> dest
                transpose[e.dest].add(new Edge(e.dest,e.src));    // dest -> src (reverse edge)
            }
        }

        // step -> 3
        while(!s.isEmpty()) {
            int curr = s.pop();
            if(!vis[curr]) {
                System.out.print("SCC -> ");
                dfs(transpose,curr,vis);
                System.out.println();
            }
        }

    }
    public static void dfs(ArrayList<Edge>[] transpose, int curr, boolean[] vis) {
        vis[curr] = true;
        System.out.print(curr+" ");

        for(int j = 0;j<transpose[curr].size();j++) {
            Edge e = transpose[curr].get(j);
            if(!vis[e.dest]) {
                dfs(transpose,e.dest,vis);
            }
        }
    }

    private static void topSort(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> s) {
        vis[curr] = true;

        for(int j = 0;j<graph[curr].size();j++) {
            Edge e = graph[curr].get(j);
            if(!vis[e.dest]) {
                topSort(graph,e.dest,vis,s);
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
