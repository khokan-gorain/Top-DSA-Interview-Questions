public class reversearray {

   public static void reverse(int num[]){
    int temp;
    int first = 0, last = num.length-1;
    while(first < last){
        temp = num[first];
        num[first] = num[last];
        num[last] = temp;
        
        first++;
        last--;
    }
   }

    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6};
        reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
