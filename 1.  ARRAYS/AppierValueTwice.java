import java.lang.annotation.Retention;

public class AppierValueTwice {
   public static boolean Appiers(int num[]){
        for(int i=0;i<num.length;i++){
            int count = 0;
            for(int j=0;j<num.length;j++){
                if(num[i] == num[j]){
                    count++;
                }
                if(count>=2){
                    return true;
                }
            }
        }
        return false;
   }

    public static void main(String[] args) {
        int num[] = {1,2,3,4};
        System.out.println(Appiers(num));
    }
}
