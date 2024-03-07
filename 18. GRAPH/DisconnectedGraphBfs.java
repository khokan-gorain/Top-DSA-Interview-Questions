import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DisconnectedGraphBfs {
    
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
        graph[0].add(new Edge(0,1,5));
        graph[0].add(new Edge(0,2, 4));

        // node 1
        graph[1].add(new Edge(1,0,5));
        
        //node 2
        graph[2].add(new Edge(2,0,5));
        graph[2].add(new Edge(2, 3, 4));

        //node 3
        graph[3].add(new Edge(3,2,5));
        
        //node 4
        graph[4].add(new Edge(4,5,5));
        
        //node 5
        graph[5].add(new Edge(5,4,5));
        graph[5].add(new Edge(5, 6, 4));

        //node 6
        graph[6].add(new Edge(6,5,5));
        
        //node 7
        graph[7].add(new Edge(7,8,5));
        graph[7].add(new Edge(7, 9, 4));

        //node 8
        graph[8].add(new Edge(8,7,5));
        
        //node 9
        graph[9].add(new Edge(9,7,5));
        
    }

    public static void bfs(ArrayList<Edge> graph[]){

        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                q.add(i);
                utilBfs(graph, vis, q);
            }
        }
    }
 
    public static void utilBfs(ArrayList<Edge> graph[], boolean vis[], Queue<Integer> q){
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String args[]){
        int V = 10;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bfs(graph);
    }
}
