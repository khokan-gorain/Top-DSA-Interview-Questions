public class StartWithPrefix {
    
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

    public static void insertWord(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean startWithPrefix(String prefix){
        Node curr = root;
        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';

            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
         String name[] = {"mom","dad","oye","khokan"};
         for(int i=0; i<name.length; i++){
            insertWord(name[i]);
         }

         System.out.println(startWithPrefix("kho"));

    }
}
