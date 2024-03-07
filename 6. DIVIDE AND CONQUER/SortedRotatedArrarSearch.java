public class SortedRotatedArrarSearch {
    
    public static int sortedArray(int arr[], int tar, int si, int ei){

        // when hit my base case 
        if(si > ei){
            return -1;
        }

        int mid = si+(ei-si)/2;
        //when find my target
        if(arr[mid] == tar){
            return mid;
        }

        // Line no. 1
        if(arr[si] <= arr[mid]){
            // left part of line no. 1
            if(arr[si] <= tar && tar <= arr[mid]){
                return sortedArray(arr, tar, si, mid-1);
            } else {
                return sortedArray(arr, tar, mid+1, ei);
            }
        } else { // Line no. 2
            if(arr[mid] <= tar && tar <= arr[ei]){
                return sortedArray(arr, tar, mid+1, ei);
            } else {
                return sortedArray(arr, tar, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int position = sortedArray(arr, 2, 0, arr.length);
        System.out.println(position);
    }
}
