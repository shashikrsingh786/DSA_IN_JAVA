import java.util.ArrayList;

public class Cycle_detection_UG {
    public static void main(String[] args) {
        int v = 5;
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
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        graph[0].add(new Edge(2,1));

        // 3 -> vertex
        graph[3].add(new Edge(3,0));

        // 4 -> vertex
        graph[4].add(new Edge(4,2));

        System.out.println(cycleDetect(graph));

    }
    public static boolean cycleDetect(ArrayList<Edge>[] graph) {
        visited = new boolean[graph.length];
        for(int i =0;i<graph.length;i++) {
            if(!visited[i]) {
                if(detectCycleUtil(graph,i, visited,-1)) {
                    return true;
                }
            }
        }
        return true;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited, int parent) {
        visited[curr] = true;
        for(int i = 0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            // case - 3
            if(!visited[e.dest]) {
                if(detectCycleUtil(graph,e.dest,visited,curr)) {
                return true;
            }
            }
           // case - 1
            else if(visited[e.dest]  && e.dest != curr)   {
                 return true;
             }
            // case - 2 ( do nothing)

        }
        return false;
    }
    static boolean[] visited;
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
}
