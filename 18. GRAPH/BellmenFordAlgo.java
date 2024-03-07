import java.util.ArrayList;

public class BellmenFordAlgo {
    
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
        graph[1].add(new Edge(1, 2, -4));

        // node 2
        graph[2].add(new Edge(2, 3, 2));

        // node 3
        graph[3].add(new Edge(3, 4, 4));

        // node 4
        graph[4].add(new Edge(4, 1, -1));
    }

    public static void bellmenFordAlgo(ArrayList<Edge> graph[], int src){

        int V = graph.length;
        int dist[] = new int[V];
        for(int i=0; i<V-1; i++){
            if( i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for(int i=0; i<V; i++){ // for every nodes

            for(int j=0; j<graph.length; j++){ // for graph array
                for(int k=0; k<graph[j].size(); k++){ // for arraylist
                    Edge e = graph[j].get(k);

                    int u = e.src;
                    int v = e.dest;
                    int w = e.wt;

                    if(dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]){
                        dist[v] = dist[u] + w;
                    }
                }
            }
        }
        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
    }

   
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

        bellmenFordAlgo(graph, 0);
    }
}
