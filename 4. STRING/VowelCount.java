public class VowelCount {
    public static int countVowel(String str){
        int totalVowel = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                totalVowel++;
            }
        }
        return totalVowel;
    }

    public static void main(String[] args) {
        String str = "aeiou";
        System.out.println(countVowel(str));
    }

}
