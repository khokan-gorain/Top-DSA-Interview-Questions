
public class WordBreakProblem {
    
    public static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i=0; i<25; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insertWord(String word[]){
        Node curr = root;
        for(int i=0; i<word.length; i++){
            int idx = word[i].charAt(i) - 'a';
            System.out.println(idx);
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean searchWord(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow == true;
    }

    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }

        for(int i=1; i<key.length(); i++){
            if(searchWord(key.substring(0, i))){
                return true;
            }        
        }
        return false;
    }

    public static void main(String[] args) {
        String name[] = {"i","like","samsung","mobile"};
        insertWord(name);
        System.out.println(searchWord("i"));

    }
}
