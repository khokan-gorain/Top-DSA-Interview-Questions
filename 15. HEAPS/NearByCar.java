import java.util.PriorityQueue;
public class NearByCar {
    static class Car implements Comparable<Car>{
        int x;
        int y;
        int distsq;
        int i;

        public Car(int x, int y, int distsq, int i){
            this.x = x;
            this.y = y;
            this.distsq = distsq;
            this.i = i;
        }

        @Override
        public int compareTo(Car c2){
            return this.distsq - c2.distsq;
        }
    }

    public static void main(String[] args) {
        int points[][] = {{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<Car> pq = new PriorityQueue<>();
        for(int i=0; i<points.length; i++){
            int dist = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            pq.add(new Car(points[i][0], points[i][1], dist, i));
        }

        for(int i=0; i<k; i++){
            System.out.print(pq.remove().i+" ");
        }
    }
}
