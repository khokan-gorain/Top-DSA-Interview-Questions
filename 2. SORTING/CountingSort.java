public class CountingSort {
    
    public static void getCountingSort(int number[]){   // 5 4 1 3 2


        // calculate maximum numbers of array
        int maxNumber = Integer.MIN_VALUE;
        for(int i=0;i<number.length-1;i++){
            maxNumber = Math.max(maxNumber, number[i]);
        }

        // count numbers
        int countArray[] = new int[maxNumber+1];
        for(int i=0; i<number.length;i++){   // 5
            countArray[number[i]]++;   
        }

        int j=0;
        for(int i=0;i<countArray.length;i++){
            while(countArray[i]>0){
                number[j] = i;
                j++;
                countArray[i]--;
            }
        }
    
    }


    public static void main(String[] args) {
        int number[] = {5,4,1,3,2};
        getCountingSort(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
}
