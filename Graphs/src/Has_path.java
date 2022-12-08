import java.util.ArrayList;

public class Has_path {
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

        visited = new boolean[graph.length];

        System.out.println(hasPath(graph,0,5));
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest) {
        if(src==dest) {
            return true;
        }
        visited[src] = true;
        for(int i = 0;i<graph[src].size();i++) {
            Edge e = graph[src].get(i);
            if (!visited[e.dest] && hasPath(graph,e.dest,dest)) {
                return true;
            }
        }
        return false;
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
