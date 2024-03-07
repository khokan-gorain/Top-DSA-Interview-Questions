import java.util.ArrayList;
import java.util.Collections;

public class KruskalAlgo {
    
    public static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge e2){
            return this.wt - e2.wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph){
        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(0, 2, 15));
        graph.add(new Edge(0, 3, 30));
        graph.add(new Edge(1, 3, 40));
        graph.add(new Edge(2, 3, 50));
    }

    static int n = 5;
    static int par[] = new int[n];
    static int rank[] = new int[n];
    public static void init(){
        for(int i=0; i<n; i++){
            par[i] = i;
        }
    }

    public static int find(int x){
        if(x == par[x]){
            return x;
        }
        return par[x] = find(x);
    }

    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);
        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        } else if(rank[parA] < rank[parB]){
            par[parA] = parB;
        } else {
            par[parB] = parB;
        }
    }

    public static void kruskalAlgo(ArrayList<Edge> graph, int v){
        init();
        Collections.sort(graph);
        int mstCost = 0;
        int count = 0;

        for(int i=0; i<v-1; i++){
            Edge e = graph.get(i);
            int parA = find(e.src);
            int parB = find(e.dest);
            if(parA != parB){
                union(parA, parB);
                mstCost += e.wt;
                count++;
            }
        }
        System.out.println("The Minimum Cost is = "+mstCost);
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);

        kruskalAlgo(graph, v);
    }
}
