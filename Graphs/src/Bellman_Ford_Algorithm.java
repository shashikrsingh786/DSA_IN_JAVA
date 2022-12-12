import java.util.ArrayList;

public class Bellman_Ford_Algorithm {
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graphs = new ArrayList<>();

        graphs.add(new Edge(0,1,2));
        graphs.add(new Edge(0,2,4));

        graphs.add(new Edge(1,2,-4));

        graphs.add(new Edge(2,3,2));

        graphs.add(new Edge(3,4,4));

        graphs.add(new Edge(4,1,-1));

        shortestPath(graphs,0,v);
    }
    public static void shortestPath(ArrayList<Edge> graphs,int src, int size) {
        int[] dis = new int[size];
        for(int i = 0;i<dis.length;i++) {
            if(i!=src) {
                dis[i] = Integer.MAX_VALUE;
            }
        }
        int V = size;
        // O(V*E)
        for(int i = 0;i<V-1;i++) {        // o(v)
                for(int k = 0;k<graphs.size();k++ ) {   // o(e)
                    Edge e = graphs.get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.weight;
                    // relaxation
                    if(dis[u]!=Integer.MAX_VALUE && dis[u]+wt<dis[v]) {
                        dis[v] = dis[u] + wt;
                    }
                }
            }
        for(int i= 0;i< dis.length;i++) {
            System.out.println(i +"->"+dis[i]);
        }
    }
    static class Edge {
        int src;
        int dest;
        int weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
}
