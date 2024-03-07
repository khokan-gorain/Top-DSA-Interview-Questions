public class FloodFillAlgo {
    
    public static void helper(int[][] images, int sr, int sc, int color, boolean vis[][], int argclr){
        if(sr < 0 || sc < 0 || sc >= images.length || sr >= images[0].length || vis[sr][sc] || images[sr][sc] != argclr){
           
            helper(images, sr, sc-1, color, vis, argclr);
            helper(images, sr, sc+1, color, vis, argclr);
            helper(images, sr-1, sc, color, vis, argclr);
            helper(images, sr+1, sc, color, vis, argclr);
        } 
    }

    public static int[][] floodFillAlgo(int[][] images, int sr, int sc, int color){
        boolean vis[][] = new boolean[images.length][images[0].length];
        helper(images, sr, sc, color, vis, images[sr][sc]);
        return images;
    }

    public static void main(String[] args) {
        int images[][] = {{1,1,1},{1,1,0},{1,0,1}};
        floodFillAlgo(images, 0, 0, 0);

        for(int i=0; i<images.length; i++){
            for(int j=0; j<images[0].length; j++){
                System.out.print(images[i][j]+" ");
            }
            System.out.println();
        }
    }
}
