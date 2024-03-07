public class QuickSort {
    public static void quickSort(int arr[], int si, int ei){

        // when hit my base case
        if(si >= ei){
            return;
        }

        int p1dx = partition(arr, si, ei);
        quickSort(arr, si, p1dx-1); // left part
        quickSort(arr, p1dx+1, ei); // right part
    }
    
    public static int partition(int arr[], int si, int ei){

        int pivat = arr[ei];
        int i = si-1;

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivat){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivat;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,0,8};
        quickSort(arr, 0,arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
