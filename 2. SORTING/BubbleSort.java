public class BubbleSort {
    public static void getBubbleSort(int numbers[]){ // 4 2 6 1 8 4 
       
        for(int i=0;i<numbers.length-1;i++){   //  4
            for(int j=0;j<numbers.length-i-1;j++){
                if(numbers[j] > numbers[j+1]){
                    int temp;
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }

            }
        }
    }


    public static void main(String[] args) {
        int numbers[] = {6,2,0,1,8,6};
        getBubbleSort(numbers);
        System.out.println("Shorted Order Array: ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
