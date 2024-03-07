import java.util.ArrayList;
import java.util.PriorityQueue;

public class ConnectingCiriesMinCost {
    
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
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 2));
        graph[0].add(new Edge(0, 3, 3));
        graph[0].add(new Edge(0, 4, 4));

        // node 1
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 5));
        graph[1].add(new Edge(1, 4, 7));

        // node 2
        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 5));
        graph[2].add(new Edge(2, 3, 6));

        // node 3
        graph[3].add(new Edge(3, 0, 3));
        graph[3].add(new Edge(3, 2, 6));

        // node 4
        graph[4].add(new Edge(4, 0, 4));
        graph[4].add(new Edge(4, 1, 7));

    }

    public static class Pair implements Comparable<Pair> {
        int v;
        int cost;

        public Pair(int v, int cost){
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }

    public static void connectingCitiesMinCost(ArrayList<Edge> graph[], int src){

        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(src, 0));
        int minCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v] = true;
                minCost += curr.cost;
                for(int i=0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }

        System.out.println("The Minimum Cost is = "+minCost);
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> gaph[] = new ArrayList[v];

        createGraph(gaph);

        connectingCitiesMinCost(gaph, 0);   
    }
}
