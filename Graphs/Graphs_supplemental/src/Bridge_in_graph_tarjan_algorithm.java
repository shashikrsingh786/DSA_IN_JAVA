import java.util.ArrayList;

public class Bridge_in_graph_tarjan_algorithm {
    public static void main(String[] args) {
        int v = 6;
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
        graph[3].add(new Edge(3,5));
        graph[3].add(new Edge(3,4));

        // 4 -> vertex
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        // 5 -> vertex
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));

        tarjanBridge(graph,v);
    }
    public static void tarjanBridge(ArrayList<Edge>[] graph, int V) {
        int[] dt  = new int[V];
        int[]  low = new int[V];
        int time = 0;
        boolean[] vis = new boolean[V];

        for(int i = 0;i<V;i++) {
            if(!vis[i]) {
                dfs(graph,i,-1,dt,low,vis,time);
            }
        }
    }
    public static void dfs(ArrayList<Edge>[] graph, int curr, int parent, int[] dt, int[] low, boolean[] vis, int time) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for(int i = 0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;
            if(neigh==parent) {
                continue;
            }
            else if(!vis[neigh]) {
                dfs(graph,neigh,curr,dt,low,vis,time);
                low[curr] = Math.min(low[curr],low[neigh]);
                if(dt[curr]<low[neigh]) {
                    System.out.println("Bridge is --> " + curr + " ----> " + neigh);
                }
            }
            else {
                low[curr] = Math.min(low[curr],dt[neigh]);
            }
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
