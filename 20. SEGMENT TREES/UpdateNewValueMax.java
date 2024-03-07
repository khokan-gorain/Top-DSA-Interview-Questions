public class UpdateNewValueMax {
    
    static int tree[];
    public static void init(int n){
        tree = new int[n*4];
    }
    public static int buildST(int arr[], int i, int si, int sj){

        if(si == sj){
            tree[i] = arr[si];
            return tree[i];
        }
        int mid = (si + sj)/2;
        int lelt = buildST(arr, 2*i+1, si, mid);
        int right = buildST(arr, 2*i+2, mid+1, sj);

        return Math.max(lelt, right);
    }

    public static void updateUtilST(int i, int si, int sj, int idx, int newValue){
        if(si == sj){
            tree[i] = newValue;
        }
        if(si != sj){
            tree[i] = Math.max(tree[i], newValue);
            int mid = (si+sj)/2;
            updateUtilST(2*i+1, si, mid, idx, newValue);
            updateUtilST(2*i+2, mid+1, sj, idx, newValue);
        }
    }

    public static void updateST(int arr[], int idx, int newValue){
        arr[idx] = newValue;
        int n = arr.length;
        updateUtilST(0, 0, n-1, idx, newValue);
    }

    public static void main(String[] args) {
        int arr[] = {6,8,-1,2,17,1,3,2,4};
        int n = arr.length;
        init(n);

        System.out.println(buildST(arr, 0, 0, n-1));

        updateST(arr, 2, 20);
        System.out.println(buildST(arr, 0, 0, n-1));

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
