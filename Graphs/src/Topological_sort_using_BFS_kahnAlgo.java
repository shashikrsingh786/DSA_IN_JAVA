import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_sort_using_BFS_kahnAlgo {
        public static void main (String[] args) {
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

            topSort(graph);
        }
        public static void calInDegree(ArrayList<Edge>[] graph,int[] inDegree) {
            for(int i = 0;i< graph.length;i++) {
                for(int j = 0;j<graph[i].size();j++) {
                    Edge e = graph[i].get(j);
                    inDegree[e.dest]++;
                }
            }
        }
        public static void topSort(ArrayList<Edge>[] graph) {
            int[] inDegree = new int[graph.length];
            calInDegree(graph,inDegree);

            Queue<Integer> q = new LinkedList<>();

            for(int i = 0;i< inDegree.length;i++) {
                if (inDegree[i] == 0) {
                    q.add(i);
                }
            }
             // bfs
            while(!q.isEmpty()) {
                int curr = q.remove();
                System.out.print(curr +" ");

                for(int i = 0;i<graph[curr].size();i++) {
                    Edge e = graph[curr].get(i);
                    inDegree[e.dest]--;
                    if(inDegree[e.dest]==0) {
                        q.add(e.dest);
                    }
                }
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

