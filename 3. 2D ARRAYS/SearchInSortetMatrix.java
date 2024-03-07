
public class SearchInSortetMatrix {
    public static boolean isFoundKey(int matrix[][],int key){

        int row = 0,col = matrix[0].length-1;
        while(row<matrix.length && col >= 0){

            if(matrix[row][col] == key){
                return true;
            } else if(key < matrix[row][col]){
                col--;
            
            } else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30},{15,25,35},{27,29,37}};
        System.out.println(isFoundKey(matrix, 12));
    }
}
