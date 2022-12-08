import java.util.ArrayList;

public class Depth_first_search {
    public static void main(String[] args) {
        int v = 7;
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

        dfs(graph);
    }
    public static void dfs(ArrayList<Edge>[] graph) {
        visited = new boolean[graph.length];
        for(int i =0;i<graph.length;i++) {
            if(!visited[i]) {
                dfsUtil(graph,i);
            }
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph, int curr) {
        System.out.print(curr+" ");
        visited[curr] = true;
        for(int i = 0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                dfsUtil(graph,e.dest);
            }
        }
    }

    static boolean[] visited;
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
