import java.util.ArrayList;

public class Mother_vertex {
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i= 0;i< graph.length;i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(graph);
        System.out.println("Mother vertex of graph is: " + motherVertex(graph,V));
    }
    public static int motherVertex(ArrayList<Edge>[] graph,int V) {
        boolean[] vis = new boolean[V];
        int v = -1;
        for(int i = 0;i<V;i++) {
            if(!vis[i]) {
                DFSUtil(graph,i,vis);
                v = i;
            }
        }
        boolean[] check = new boolean[V];
        DFSUtil(graph,v,check);

        for(int i = 0;i< check.length;i++) {
            if(!check[i]) {
                return -1;
            }
        }
        return v;
    }
    public static void DFSUtil(ArrayList<Edge>[] graph,int k, boolean[] vis) {
        vis[k] = true;
        for(int i = 0;i<graph[k].size();i++) {
            Edge e = graph[k].get(i);
            if(!vis[e.dest]) {
                DFSUtil(graph, e.dest, vis);
            }
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,3));

        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,6));
        graph[5].add(new Edge(5,2));

        graph[6].add(new Edge(6,4));
        graph[6].add(new Edge(6,0));
    }
    public static class Edge {
        int src;
        int dest;

        Edge(int src,int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
}
