public class SelectionSort{

    public static void getSelectionSort(int numbers[]){  // 5 3 7 1 5
        for(int i=0;i<numbers.length-1;i++){  // 5
            int minIndx = i;
            for(int j=i+1;j<numbers.length;j++){  // 3
                if(numbers[minIndx] > numbers[j]){  // 5 > 3
                     minIndx = j;
                }
            }

            int temp;
            temp = numbers[i];
            numbers[i] = numbers[minIndx];
            numbers[minIndx] = temp;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {7,3,8,1,0,2};
        getSelectionSort(numbers);

        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}