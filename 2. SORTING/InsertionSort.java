public class InsertionSort {
 
    public static void getInsertationSort(int number[]){  // 5 4 1 3 2

        for(int i=1; i<number.length; i++){
            int current = number[i];  // 4
            int prev = i-1;  // 5

            while(prev >= 0 && number[prev] > current){
                number[prev+1] = number[prev];
                prev--;
            }
            number[prev+1] = current;

        }
    }

    public static void main(String[] args) {
        int numbers[] = {5,4,1,3,2};
        getInsertationSort(numbers);

        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
