import java.util.ArrayList;

public class HasPathCount {
    
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

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    public static boolean utilHasPath(ArrayList<Edge> graph[], int src, int dest, boolean vis[]){
        if(src == dest){
            return true;
        }
        vis[src] = true;
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!vis[src] && utilHasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }
    public static boolean hasPathCount(ArrayList<Edge> graph[], int src, int dest, boolean vis[]){

        int count = 0;
        if(src == dest){ // base case
            return true;
        }

        vis[src] = true;
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!vis[src] && hasPathCount(graph, e.dest, dest, vis)){
                count++;
                return true;
            }
        }
        System.out.println(count);
        return false;
    }

    public static void main(String[] args) {
        int V = 7;
        int src = 0;
        int dest = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        boolean vis[] = new boolean[graph.length];

        createGraph(graph);

        System.out.println(hasPathCount(graph, src, dest, vis));

    }
}
