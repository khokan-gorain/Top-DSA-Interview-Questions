public class Palindrome {
    public static boolean palindromeWord(String str) {
        int x;
        x = str.length();
        for (int i = 0; i < x / 2; i++) {
            if (str.charAt(i) != str.charAt(x - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(palindromeWord(str));
    }
}
