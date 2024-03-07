public class SudokuSolver {
    
    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        
        // column check 
        for(int i=0; i<=8; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }

        // row check
        for(int j=0; j<=8; j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }

        // grid check 3x3 matrix
        int sr = (row/3)*3; // starting row 
        int sc = (col/3)*3; // starting column 
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
 
        return true;

    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        
        //base case
        if(row == 9){
            return true;
        }

        // recursion 
        int nextRow = row, nextCol = col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }

        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for(int digit=1; digit<=9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;

                if(sudokuSolver(sudoku, nextRow, nextCol)){ // check next row and column 
                    return true;
                }
                sudoku[row][col] = 0; // backtracking when not safe
            }
            
        }
        return false;

    }

    public static void printSudoku(int sudoku[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
             System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] =  {
            { 7, 0, 0, 0, 0, 0, 2, 0, 0 },   
            { 4, 0, 2, 0, 0, 0, 0, 0, 3 },   
            { 0, 0, 0, 2, 0, 1, 0, 0, 0 },   
            { 3, 0, 0, 1, 8, 0, 0, 9, 7 },   
            { 0, 0, 9, 0, 7, 0, 6, 0, 0 },   
            { 6, 5, 0, 0, 3, 2, 0, 0, 1 },   
            { 0, 0, 0, 4, 0, 9, 0, 0, 0 },   
            { 5, 0, 0, 0, 0, 0, 1, 0, 6 },   
            { 0, 0, 6, 0, 0, 0, 0, 0, 8 }    
        };

        if(sudokuSolver(sudoku,0,0)){
            System.out.println("Solution exists");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution does not exists");
        }
    }

}
