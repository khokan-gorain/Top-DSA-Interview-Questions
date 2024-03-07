public class UpdateST {
    
    static int tree[];

    public static void init(int n){
        tree = new int[n*4];
    }

    public static int buildST(int arr[], int i, int start, int end){

        if(start == end){ // base case
            tree[i] = arr[start];
            return tree[start];
        }

        int mid = (start + end)/2;
        buildST(arr, 2*i+1, start, mid);
        buildST(arr, 2*i+2, mid+1, end);
        tree[i] = tree[2*i+1] + tree[2*i+2];
        return tree[i];
    }

    public static void updateUtil(int i, int si, int sj, int idx, int diff){
        if(idx > sj || idx < si){ // non-overlap condition
            return;
        }
        tree[i] += diff;
        if(si != sj){ // non-leaf node
            int mid = (si+sj)/2;

            updateUtil(2*i+1, si, mid, idx, diff); // left child
            updateUtil(2*i+2, mid+1, sj, idx, diff); // right child
        }
    }

    public static void updateST(int arr[], int idx, int newValue){
        int n = arr.length;
        int diff = newValue - arr[idx];
        arr[idx] = newValue;
        updateUtil(0, 0, n-1, idx, diff);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);
        System.out.println(buildST(arr, 0, 0, n-1));

        updateST(arr, 1, 5); 

        System.out.println(buildST(arr, 0, 0, n-1));
    }
}
