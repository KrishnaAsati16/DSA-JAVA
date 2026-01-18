import java.util.Stack;

public class ParenthesesChecker {
    static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "{[(])}";
        String s3 = "((()))";

        System.out.println(s1 + " -> " + isBalanced(s1));
        System.out.println(s2 + " -> " + isBalanced(s2));
        System.out.println(s3 + " -> " + isBalanced(s3));
    }

    static boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            }
            else { // closing bracket
                if(st.size() == 0) return false;

                char top = st.peek();

                if(sameStyle(top, ch)) st.pop();
                else return false;
            }
        }
        return st.size() == 0;
    }

    static boolean sameStyle(char a, char b){
        if(a == '(' && b == ')') return true;
        if(a == '[' && b == ']') return true;
        if(a == '{' && b == '}') return true;
        return false;
    }
}
