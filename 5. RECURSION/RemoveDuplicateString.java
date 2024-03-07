public class RemoveDuplicateString {
    
    public static void removeDuplicate(String str, int idx, StringBuilder newString, boolean map[]){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        if(map[currentChar-'a'] == true){
            removeDuplicate(str, idx+1, newString, map);
        } else{
            map[currentChar-'a'] = true;
            removeDuplicate(str, idx+1, newString.append(currentChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "aappnicollege";
       // boolean map[] = new boolean[26];
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
