public class insert {
    public static void inserSort(int numbers[]){

        for(int i=1;i<numbers.length;i++){  // 5 1 4 8 3
            int current = numbers[i]; // 1
            int prev = i-1; // 5
        
            while(prev >= 0 && numbers[prev] > current){
                numbers[prev+1] = numbers[prev];
                prev--;
            }
            numbers[prev+1] = current;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {4,1,8,3,9};
        inserSort(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
