import java.util.ArrayList;

public class All_path_from_source_to_dest {
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

        int src = 5, dst = 1;

        findPath(graph,src,dst,"");
    }

    private static void findPath(ArrayList<Edge>[] graph, int src, int dst,String path) {
        if(src==dst) {
            path+=src;
            System.out.println(path+" ");
            return;
        }
        for(int i = 0;i<graph[src].size();i++) {
            Edge e = graph[src].get(i);
            findPath(graph,e.dest,dst,path+src);
        }
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
