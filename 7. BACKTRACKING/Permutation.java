public class Permutation {
    
    public static void findPermutaion(String str, String ans){

        // base case
        if(str.length() == 0){
            System.out.print(ans+" ");
            return;
        }

        // recursion
        for(int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1, str.length());

            findPermutaion(newString, ans+currentChar); // recursion call 

        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        findPermutaion(str, "");
    }
}
