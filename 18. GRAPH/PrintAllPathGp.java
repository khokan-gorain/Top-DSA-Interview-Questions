import java.util.ArrayList;

public class PrintAllPathGp {
    
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int ser, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // // node 0
        // graph[0].add(new Edge(0, 3, 0));

        // // node 1
        // graph[1].add(new Edge(1, 1, 0));

        // // node 2
        // graph[2].add(new Edge(2, 3, 0));

        // // node 3
        // graph[3].add(new Edge(3, 3, 0));

        // // node 4
        // graph[4].add(new Edge(4, 0, 0));
        // graph[4].add(new Edge(4, 1, 0));

        // // node 5
        // graph[5].add(new Edge(5, 0, 0));
        // graph[5].add(new Edge(5, 2, 0)); 
        
        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 3, 0));
        
        graph[1].add(new Edge(1, 2, 0)); 
        graph[2].add(new Edge(2, 3, 0)); 
        graph[3].add(new Edge(3, 1, 0)); 
        

    }

    public static void printAllPath(ArrayList<Edge> graph[], int src, int dest, String path){

        if(src == dest){
            System.out.print(path+dest+" ");
            return;
        }

        // src mins current node
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            printAllPath(graph, e.dest, dest, path+src+" ");
        }
    }

    public static void main(String[] args) {
         int v = 6;
         ArrayList<Edge> graph[] = new ArrayList[v];

         createGraph(graph);
         printAllPath(graph, 0, 3, "");
    }
}
