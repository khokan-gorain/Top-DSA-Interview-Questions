public class BinarySearch {

    public static void print(){
        System.out.println("YES");
    }
    public static void binarySearch(int num[],int key){
        int start = 0,end = num.length-1,mid;
        boolean isFound = false;

        while(start <= end){
            mid = (start+end)/2;
            if(num[mid] == key){
               isFound = true;
               //System.out.println("Found");
            }

            if(num[mid] < key){
                start = mid+1;
            } else if(num[mid] > key){
                end = mid-1;
            }       
        }
        if(isFound == true){
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }


    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        binarySearch(num, 6);
       // print();
    }
}
