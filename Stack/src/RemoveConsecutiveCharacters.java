import java.util.Stack;

public class RemoveConsecutiveCharacters {
        static String removeConsecutive(String s) {

            Stack<Character> st = new Stack<>();

            for (int i = 0; i < s.length(); i++) {

                char ch = s.charAt(i);

                // If stack empty or top is not same, push
                if (st.isEmpty() || st.peek() != ch) {
                    st.push(ch);
                }
            }

            // Convert stack to string
            StringBuilder result = new StringBuilder();

            for (char c : st) {
                result.append(c);
            }

            return result.toString();
        }

        public static void main(String[] args) {

            String input = "aaaaaabbbbccddda";

            System.out.println("Input  : " + input);
            System.out.println("Output : " + removeConsecutive(input));
        }
    }

