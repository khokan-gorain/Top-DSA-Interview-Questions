import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlightsWithKStop {
    
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(int fligths[][], ArrayList<Edge> graph[]){

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<fligths.length; i++){
            int src = fligths[i][0];
            int dest = fligths[i][1];
            int cost = fligths[i][2];

            Edge e = new Edge(src, dest, cost);
            graph[src].add(e);
        }
    }

    public static class FligthInfo {
        int v;
        int cost;
        int stop;

        public FligthInfo(int v, int cost, int stop){
            this.v = v;
            this.cost = cost;
            this.stop = stop;
        }
    }

    public static int cheapestFlights(int fligths[][], int src, int dest, int k, int n){

        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(fligths, graph);

        int dist[] = new int[n];
        for(int i=0; i<dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<FligthInfo> q = new LinkedList<>();
        q.add(new FligthInfo(src, 0, 0));

        while (!q.isEmpty()) {
            FligthInfo curr = q.remove();
            if(curr.stop > k){
                break;
            }
            for(int i=0; i<graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);

                int u = e.src;
                int v = e.dest;
                int w = e.wt;

                if(curr.cost + w < dist[v] && curr.stop <= k){
                    dist[v] = curr.cost + w;
                    q.add(new FligthInfo(v, curr.cost, curr.stop + 1));
                }
            }
        }

        if(dist[dest] == Integer.MAX_VALUE){
            return -1;
        } else {
            return dist[dest];
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int fligths[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0; // source
        int dest = 3; // destination
        int k = 1; // stops

        System.out.println(cheapestFlights(fligths, src, dest, k, n));
    }
}
