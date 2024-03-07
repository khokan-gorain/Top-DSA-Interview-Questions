public class BacktrackingArray {
    public static void changArray(int arr[], int i, int value){

        // base case
        if(i == arr.length){
            printArray(arr);
            return;
        }

        //recursion 
        arr[i] = value;
        changArray(arr, i+1, value+1);
        arr[i] = arr[i]-2;
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    

     public static void main(String[] args) {
        
        int arr[] = new int[5];
        changArray(arr, 0, 1);
        printArray(arr);
    }
}
