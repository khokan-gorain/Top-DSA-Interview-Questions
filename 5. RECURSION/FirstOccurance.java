public class FirstOccurance {
    public static int fOccurance(int arr[],int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return fOccurance(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1,8,6};
        System.out.println(fOccurance(arr, 6, 0));
    }
}
