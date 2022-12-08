import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite_graph {
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i=0;i<graph.length;i++ ) {
            graph[i] = new ArrayList<>();
        }
        // 0 -> vertex
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        // 1-> vertex
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        // 2 -> vertex
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));

        // 3 -> vertex
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));

        System.out.println(bipartite(graph));


    }
    public static boolean bipartite(ArrayList<Edge>[] graph) {
        int[] color = new int[graph.length];
        for(int s : color) {
            s = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i< graph.length;i++) {
            if(color[i]==-1) {
                q.add(i);
                color[i] = 0;
                while(!q.isEmpty()) {
                    int curr = q.remove();
                    for(int j = 0;j<graph[curr].size();j++) {
                        Edge e = graph[curr].get(j);
                        if(color[e.dest]==-1) {
                            int nextCol = color[curr] == 0 ?1:0;
                            color[e.dest] = nextCol;
                            q.add(e.dest);
                        }
                        else if(color[e.dest]==color[curr]) {
                            return false;    // not bipartite
                        }
                    }
                }
            }
        }
            return true;
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
