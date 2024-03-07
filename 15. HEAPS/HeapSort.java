public class HeapSort {
    
    public static void heapify(int arr[], int i, int size){

        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        int maxIdx = i; // root node

        if(leftChild < size && arr[leftChild] > arr[maxIdx]){
            maxIdx = leftChild;
        }
         if(rightChild < size && arr[rightChild] > arr[maxIdx]){
            maxIdx = rightChild;
         }

         if(maxIdx != i){
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapify(arr, maxIdx, size);
         }
    }

    public static void heapSort(int arr[]){
        // step 1: build max heap
        int x = arr.length;
        for(int i=x/2; i>=0; i--){
            heapify(arr,i,x);
        }

        // step 2: push large at the end
        for(int i=x-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i]= temp;
            heapify(arr, 0, i);

        }
    }

    public static void main(String[] args) {
        int arr[] = {3,7,1,0,4,8};
        heapSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
