public class LastOccurance {
    public static int lOccurance(int arr[], int key, int i){
        // base case
        if(i == arr.length){
            return -1;
        }
         
        int isfound = lOccurance(arr, key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,9,8,9};
        System.out.println(lOccurance(arr, 9, 0));
    }
}


