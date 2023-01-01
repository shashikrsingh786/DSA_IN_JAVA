import java.util.ArrayList;
import java.util.Collections;

public class Kruskal_algorithm {
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> edge = new ArrayList<>();
        createGraph(edge);
        System.out.println(kruskal(edge,v));   // work on MST and using greedy to find minimum cost
        // time complexity is : O(V+ElogE)

    }
    public static int kruskal(ArrayList<Edge> edge,int v) {
        init();
        Collections.sort(edge);  // O(ElogE)

        int finalCost = 0;
        int Count = 0;
        for(int i = 0;Count<v-1;i++) {    // O(v)
            Edge e = edge.get(i);

            int par1 = find(e.src);
            int par2 = find(e.dest);

            if(par1!=par2) {
                union(e.src,e.dest);
                finalCost += e.cost;
                Count++;
            }
        }
        return  finalCost;
    }
    public static void createGraph(ArrayList<Edge> edge) {
        edge.add(new Edge(0,1,10));
        edge.add(new Edge(0,3,30));
        edge.add(new Edge(0,2,15));
        edge.add(new Edge(1,3,40));
        edge.add(new Edge(2,3 ,50));
    }
    static int n = 4;  // vertices
    static int[] par = new int[n];
    static int[] rank = new int[n];

    static void init() {
        for(int i= 0;i<par.length;i++) {
            par[i] = i;
        }
    }
    static int find(int x) {
        if(x==par[x]) {
            return x;
        }
        return par[x] = find(par[x]);    // path compression
    }
    static void union(int a, int b) {
        int par1 = find(a);   // find parent of a
        int par2 = find(b);   // find parent of b

        if(rank[par1]==rank[par2]) {
            par[par2] = par1;
            rank[par1]++;
        }
        else if(rank[par1]>rank[par2]) par[par2] = par1;
        else par[par1] = par2;
    }
    public static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int cost;

        Edge(int src,int dest, int cost) {
            this.src = src;
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost-o.cost;
        }
    }
}
