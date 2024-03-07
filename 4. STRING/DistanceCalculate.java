public class DistanceCalculate {
    public static float calculateDistance(String path){
        int x=0,y=0;
        for(int i=0; i<path.length(); i++){
            char dist = path.charAt(i);
            // south
            if(dist == 's'){
                y++;
            } else if(dist == 'n'){
                y--;
            } else if(dist == 'e'){
                x--;
            } else {
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        float totalDistance = (float)Math.sqrt(x2+y2);
        return totalDistance;
    }

    public static void main(String[] args) {
        String path = "wneenesennns";
        System.out.println(calculateDistance(path));
    }
}
