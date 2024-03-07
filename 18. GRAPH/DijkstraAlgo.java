import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgo {
    
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

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // node 0
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        // node 1
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(0, 2, 1));

        // node 2
        graph[2].add(new Edge(2, 4, 3));

        // node 3
        graph[3].add(new Edge(3, 5, 1));

        // node 4
        graph[4].add(new Edge(4, 5, 5));

        // node 5
        graph[5].add(new Edge(5, 5, 0));

    }

    public static class Pair implements Comparable<Pair> {

        int n; // node
        int cost; // cost

        public Pair(int n, int cost){
            this.n = n;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }

    public static void dijkstraAlgo(ArrayList<Edge> graph[], int src){

        boolean vis[] = new boolean[graph.length];
        int dist[] = new int[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i=0; i<dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        pq.add(new Pair(src, 0)); // source, cost
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            for(int i=0; i<graph[curr.n].size(); i++){
                Edge e = graph[curr.n].get(i);

                int u = e.src;
                int v = e.dest;
                int w = e.wt;

                if(dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }

        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
    
    }

    public static void main(String[] args) {
        
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

        dijkstraAlgo(graph, 0);
    }
 
}
