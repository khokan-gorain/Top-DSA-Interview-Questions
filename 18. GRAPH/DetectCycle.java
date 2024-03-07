import java.util.ArrayList;

public class DetectCycle {
    
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
        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));
        graph[0].add(new Edge(0, 3, 0));

        // node 1
        graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 2, 0));

        //node 2
        graph[2].add(new Edge(2, 0, 0));
        graph[2].add(new Edge(2, 1, 0));

        //node 3
        graph[3].add(new Edge(3, 0, 0));
        graph[3].add(new Edge(3, 4, 0));

        //node 4
        graph[4].add(new Edge(4, 3, 0));
    }


    public static boolean detectCycle(ArrayList<Edge> graph[]){

        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(detectCycleUtil(graph, vis, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean vis[], int curr, int parent){

        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            //case 1
            if(!vis[e.dest]){
                if(detectCycleUtil(graph, vis, e.dest, curr)){
                    return true;
                } 
            } else if(vis[e.dest] && e.dest != parent){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5; // numbers of node
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(detectCycle(graph));
    }
}
