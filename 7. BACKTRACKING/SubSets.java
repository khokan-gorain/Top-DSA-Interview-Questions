public class SubSets {
    public static void subSets(String str, int i, String ans){

        // base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.print("null");
            } else {
                System.out.print(ans +" ");
            }
            
            return;
        }

        // recursion
        subSets(str, i+1, ans+str.charAt(i)); // for yes choice
        subSets(str, i+1, ans); // for not choice
    }


    public static void main(String[] args) {
        String str = "abc";
        subSets(str, 0, "");
    }
}
