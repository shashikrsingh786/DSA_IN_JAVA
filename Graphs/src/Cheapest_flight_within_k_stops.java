import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Cheapest_flight_within_k_stops {
    public static void main(String[] args) {
        int n = 4;
        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0, dist = 3, k = 1;

        int finalAns = cheapestFlight(flights,n,src,dist,k);

        if(finalAns==-1) {
            System.out.println("No such path exist");
        }
        else {
            System.out.println(finalAns);
        }
    }
    public static int cheapestFlight(int[][] flights, int n, int src, int dest, int k) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(flights,graph,n);

        int[] dist = new int[n];
        for(int i = 0;i<dist.length;i++) {
            if(i!=src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(0,0,0));

        while(!q.isEmpty()) {
            Info curr = q.remove();
            if(curr.stops>k) {
                break;
            }
            for(int i = 0;i<graph[curr.v].size();i++) {
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.cost;

                if(curr.cost+wt<dist[v] && curr.stops<=k) {
                    dist[v] = curr.cost+wt;
                    q.add(new Info(v,dist[v],curr.stops+1));
                }

            }
        }

        if(dist[dest]==Integer.MAX_VALUE) {
            return -1;
        }
        return dist[dest];



    }

    public static class Info {
        int v;
        int cost;
        int stops;

        public Info(int v, int cost, int stops) {
            this.v = v;
            this.cost = cost;
            this.stops = stops;
        }
    }
    public static void createGraph(int[][] flights, ArrayList<Edge>[] graph, int n) {
        for(int i = 0;i<n;i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i = 0;i<flights.length;i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int cost = flights[i][2];

            Edge e = new Edge(src,dest,cost);
            graph[src].add(e);
        }
    }
    public static class Edge {
        int src;
        int dest;
        int cost;

        Edge(int  src, int dest, int cost) {
            this.src = src;
            this.dest = dest;
            this.cost = cost;
        }
    }

}
