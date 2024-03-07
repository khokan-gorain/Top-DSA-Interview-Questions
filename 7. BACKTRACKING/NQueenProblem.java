public class NQueenProblem {
    

    public static boolean isSafe(char board[][], int row, int col){

        // vertical-up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // right diagnol-up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
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
    public static void nQueenProblem(char board[][], int row){

        // base case
        if(row == board.length){
            printBoard(board);
            return;
        }

        // for all column 
        for(int i=0; i<board.length; i++){
            if(isSafe(board, row, i)){
               board[row][i] = 'Q';
                nQueenProblem(board, row+1); // recursion call 
                board[row][i] = 'X'; // backtracking for not safe queen 
            }
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("------Chess Board------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int n=4;
        char board[][] = new char[n][n];

        // intitalize 
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = 'X';
            }
            System.out.println();
        }

        nQueenProblem(board, 0); // function call 
    }
}

