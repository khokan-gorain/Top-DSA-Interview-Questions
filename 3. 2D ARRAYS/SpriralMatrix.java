
public class SpriralMatrix {
    
    public static void spriralMatrixCalculate(int martix[][]){
        int startRow = 0;
        int startClm = 0;
        int endRow = martix.length-1;// 2
        int endClm = martix[0].length-1;// 2


            while(startRow <= endRow && startClm <= endClm){

            // top 
            for(int i=startClm;i<=endClm;i++){
                System.out.print(martix[startRow][i]+" ");
            }

            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(martix[i][endClm]+" ");
            }

            // buttom
            for(int i=endClm-1; i>=startClm; i--){
                System.out.print(martix[endRow][i]+" ");
            }

            // left
            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(martix[i][startClm]+" ");
            }

            startRow++;
            endRow--;
            startClm++;
            endClm--;
        }
    }

    public static void main(String[] args) {
        int martix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        spriralMatrixCalculate(martix);
        // for(int i=0;i<martix.length;i++){
        //     for(int j=0;i<martix[0].length;j++){
        //         System.out.print(martix[i][j]);
        //     }
        // }

    }
}
