import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Breadth_First_Search {
    public static void main(String[] args) {
        int v = 9;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i=0;i<graph.length;i++ ) {
            graph[i] = new ArrayList<>();
        }
        // 0 -> vertex
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        // 1-> vertex
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        // 2 -> vertex
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        // 3 -> vertex
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,5,1));
        graph[3].add(new Edge(3,4,1));

        // 4 -> vertex
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        // 5 -> vertex
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        // 6 -> vertex
        graph[6].add(new Edge(5,6,1));

        graph[7].add(new Edge(7,8,1));
        graph[8].add(new Edge(8,7,1));



        bfs(graph);    // breadth first search
    }

    public static void bfs(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for(int i =0;i<graph.length;i++) {
            if(!visited[i]) {
                bfsUtil(graph, visited,i);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph,boolean[] visited, int el) {
        Queue<Integer> q = new LinkedList<>();

            q.add(el);   // src = 0

            while(!q.isEmpty()) {
                int curr = q.remove();
                if(!visited[curr]) {
                    System.out.print(curr+" ");
                    visited[curr] = true;
                    for(int i = 0;i<graph[curr].size();i++) {
                        Edge e = graph[curr].get(i);
                        q.add(e.dest);
                    }
                }
            }
    }
    static class Edge {
        int src;
        int dest;
        int weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.weight = weight;
            this.dest = dest;
        }
    }
}
