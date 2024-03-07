public class Anagram {
    public static boolean anagramWord(String str1, String str2) {
        char ch1, ch2, count = 0;
        int x, y;
        boolean status;
        x = str1.length();
        y = str2.length();
        if (x == y) {
            for (int i = 0; i < x; i++) { // abc
                ch1 = str1.charAt(i);
                for (int j = 0; j < y; j++) { // bca
                    ch2 = str2.charAt(j);
                    if (ch1 == ch2) {
                        count++;
                    }
                }
            }
        }
        if (count == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "bce";

        System.out.println(anagramWord(str1, str2));
    }

}
