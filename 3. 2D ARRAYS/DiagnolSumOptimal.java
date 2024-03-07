public class DiagnolSumOptimal {
    public static int diagnolSum(int matrix[][]){

        int sum=0;
        for(int i=0;i<matrix.length;i++){
            // primary diagnol sum
            sum += matrix[i][i];

            // secondery diagnol sum
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        int martix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagnolSum(martix));
    }
}

