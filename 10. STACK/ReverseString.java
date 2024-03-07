import java.util.Stack;
public class ReverseString {
    
    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>();

        int index = 0;
        while(index < str.length()){
            stack.push(str.charAt(index));
             index++;
        }

        StringBuilder result = new StringBuilder("");
        char ch;
        while(!stack.isEmpty()){
            ch = stack.pop();
            result.append(ch);
        }      
        return result.toString();
        
    }

    public static void main(String[] args) {
        String str = "khokan";
        System.out.println(reverseString(str));

    }
}
