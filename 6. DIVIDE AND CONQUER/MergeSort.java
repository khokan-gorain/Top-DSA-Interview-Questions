public class MergeSort {
    
    public static void mergeSortFn(int arr[], int si, int ei){

        // base case
        if(si >= ei){
            return;
        }
        int mid = si+(ei - si)/2;

        mergeSortFn(arr, si, mid); // first part of array
        mergeSortFn(arr, mid+1, ei); // 2nd part of array

        mergeData(arr, si, mid, ei);
    
    }

    public static void mergeData(int arr[], int si, int mid, int ei){
        
        int i = si;
        int j = mid+1;
        int k = 0;
        int temp[] = new int[ei-si+1];

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
               temp[k] = arr[i];
               i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,7,1,4,-6};
        mergeSortFn(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
