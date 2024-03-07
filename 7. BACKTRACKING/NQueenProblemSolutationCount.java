public class NQueenProblemSolutationCount {

    public static boolean isSafe(char board[][], int row, int col){

        // vertical-up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
         
        // right diagnol-up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // left diagnol-up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
    
    public static void nQueen(char board[][], int row){

        // base case
        if(row == board.length){
            count++;
            return;
        }

        // for all column 
        for(int i=0; i<board.length; i++){
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                nQueen(board, row+1); // recursion call

                board[row][i] = 'X'; // backtracking call when queen is not safe 
            }
        }
    }

     static int count = 0;

     public static void main(String[] args) {
        int n=5;
        char board[][] = new char[n][n];

        nQueen(board, 0); // function call 

        System.out.println("Number of solutation is "+count);

     }
}
