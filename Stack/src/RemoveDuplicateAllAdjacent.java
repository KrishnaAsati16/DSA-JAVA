import java.util.Stack;

public class RemoveDuplicateAllAdjacent {

        static String removeDuplicates(String s) {

            Stack<Character> st = new Stack<>();

            for (int i = 0; i < s.length(); i++) {

                char ch = s.charAt(i);

                if (!st.isEmpty() && st.peek() == ch) {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }

            StringBuilder result = new StringBuilder();

            for (char c : st) {
                result.append(c);
            }

            return result.toString();
        }

        public static void main(String[] args) {

            String s = "abbaca";

            System.out.println(removeDuplicates(s));
        }
    }


