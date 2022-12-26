import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prim_algorithm {
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i=0;i<graph.length;i++ ) {
            graph[i] = new ArrayList<>();
        }
        // 0 -> vertex
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));


        // 1-> vertex
        graph[1].add(new Edge(1,3,40));
        graph[1].add(new Edge(1,0,10));


        // 2 -> vertex
        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        // 3 -> vertex
        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));

        System.out.println(primAlgorithm(graph));
    }
    public static int primAlgorithm(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        int finalCost = 0;
        pq.add(new Pair(0,0));


        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.v]) {
                vis[curr.v] = true;
                finalCost+= curr.cost;
                for(int i = 0;i<graph[curr.v].size();i++) {
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest,e.wt));
                }
            }
        }
        return finalCost;
    }
    public static class Pair implements Comparable<Pair> {
        int v;
        int cost;
        
        Pair(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair o) {
            return this.cost-o.cost;
        }
    }
}
    class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
}
