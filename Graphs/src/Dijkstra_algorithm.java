import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra_algorithm {
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graphs = new ArrayList[v];
        for(int  i = 0;i<graphs.length;i++) {
            graphs[i] = new ArrayList<>();
        }
        graphs[0].add(new Edge(0,1,2));
        graphs[0].add(new Edge(0,2,4));

        graphs[1].add(new Edge(1,3,7));
        graphs[1].add(new Edge(1,2,1));

        graphs[2].add(new Edge(2,4,3));

        graphs[3].add(new Edge(3,5,1));

        graphs[4].add(new Edge(4,3,2));
        graphs[4].add(new Edge(4,5,5));

        int src = 0, dest = 5;

        dijkstra(graphs,src,dest);

    }

    private static void dijkstra(ArrayList<Edge>[] graphs, int src, int dest) {
        int[] dist = new int[graphs.length];  // to store src to dist path
        boolean[] vis = new boolean[graphs.length];
        for(int i = 0;i<dist.length;i++) {
            if(i!=src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src,0));

        //bfs
        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.n]) {
                vis[curr.n] = true;
                for(int i = 0;i<graphs[curr.n].size();i++) {
                    Edge e = graphs[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.weight;
                    if(dist[u]+wt<dist[v]) {
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        // print shortest path from source to vertices
        for(int i = 0;i< dist.length;i++) {
            System.out.print(dist[i]+" ");
        }
        System.out.println();

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

    static class Pair implements  Comparable<Pair> {
        int n;
        int path;

        public Pair(int n,int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair o) {
            return this.path-o.path;   // ascending order sorting
        }
    }
}
