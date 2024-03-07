public class GridWaysProblem {
    
    public static int findGridWays(int i, int j, int n, int m){

        // base case
        if(i == n-1 && j == m-1){
            return 1; // same cell
        } else {
            if(i == n || j == m){
                return 0; // cross boundry
            }
        }

        // recursion   
        int way1 = findGridWays(i+1, j, n, m); // down terversing
        int way2 = findGridWays(i, j+1, n, m); // left terversing

        return way1 + way2;
    }

    public static void main(String[] args) {
        int n=3, m=3;
        System.out.println("Number of ways is "+findGridWays(0, 0, n, m));
    }
}
