import java.util.ArrayList;

public class Articulation_point {
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i=0;i<graph.length;i++ ) {
            graph[i] = new ArrayList<>();
        }
        // 0 -> vertex
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        // 1-> vertex
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        // 2 -> vertex
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,0));

        // 3 -> vertex
        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        // 4 -> vertex
        graph[4].add(new Edge(4,3));

        articulationPoint(graph,v);

    }
    public static void articulationPoint(ArrayList<Edge>[] graph, int v) {
        int[] dt = new int[v];
        int[] low = new int[v];
        int time = 0;
        boolean[] vis = new boolean[v];

        for(int i = 0;i<v;i++) {
            if(!vis[i]) {
                dfs(graph, i, -1, dt, low, vis, time);
            }
        }
    }
    public static void dfs(ArrayList<Edge>[] graph, int curr, int par, int[] dt, int[] low, boolean[] vis, int time) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

        for(int i = 0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;

            if(par==neigh) continue;
            else if(vis[neigh]) {
                low[curr] = Math.min(low[curr],dt[neigh]);
            }
            else {
                dfs(graph,neigh,curr,dt,low,vis,time);
                low[curr] = Math.min(low[curr],low[neigh]);
                if(par != -1 && dt[curr]<=low[neigh]) {
                    System.out.println("AP : " + curr);
                }
                children++;
            }
        }
        if(par == -1 && children>1) {
            System.out.println("Ap : " + curr);
        }

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
