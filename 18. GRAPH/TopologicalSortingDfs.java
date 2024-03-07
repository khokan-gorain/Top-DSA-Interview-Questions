import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortingDfs {
    
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
        graph[0].add(new Edge(0, 0, 0));

        // node 1
        graph[1].add(new Edge(1, 1, 0));

        // node 2
        graph[2].add(new Edge(2, 3, 0));

        // node 3
        graph[3].add(new Edge(3, 1, 0));

        // node 4
        graph[4].add(new Edge(4, 0, 0));
        graph[4].add(new Edge(4, 1, 0));

        // node 5
        graph[5].add(new Edge(5, 0, 0));
        graph[5].add(new Edge(5, 2, 0));
    }

    public static void topSorting(ArrayList<Edge> graph[]){
        
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack();

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                topSortingUtil(graph, i, vis, s);
            }

            if(!s.isEmpty()){
                System.out.println(s.pop());
            }
        }
    }

    public static void topSortingUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s){
           
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topSortingUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void main(String[] args) {
         int V = 6;
         ArrayList<Edge> graph[] = new ArrayList[V];

         createGraph(graph);

         topSorting(graph);
    }
}
