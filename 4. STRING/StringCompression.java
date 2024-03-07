public class StringCompression {
    public static String compression(String str) {
        String compressString = "";
        for (int i = 0; i < str.length(); i++) {  // aaabbcdddd
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            compressString += str.charAt(i);
            if (count > 1) {
                compressString += count.toString();
            }
        }
        return compressString;
    }

    public static void main(String[] args) {
        String str = "aaabbcdddd";
        System.out.println(compression(str));
    }
}
