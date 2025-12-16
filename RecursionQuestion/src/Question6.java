// GENERATE PARENTHESES
// LEET CODE 22.

//import java.util.ArrayList;
//import java.util.List;
//
//public class Question6 {
//public void generate(int n , int i,int r , String s){
//
//}
//      public List<String> generateparenthesis(int n){
//        List<String> ans = new ArrayList<>();
//            generate(n,0,0,"");
//            return ans;
//}
//    public static void main(String[] args) {
//        Question6 q = new Question6();
//        System.out.println(q.generateparenthesis(3));
//    }
//}

import java.util.ArrayList;
import java.util.List;

public class Question6 {

    // Recursive helper function
    public void generate(int n, int open, int close, String s, List<String> ans) {

        // Base condition
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }

        // Add opening bracket
        if (open < n) {
            generate(n, open + 1, close, s + "(", ans);
        }

        // Add closing bracket
        if (close < open) {
            generate(n, open, close + 1, s + ")", ans);
        }
    }

    // Main function
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, 0, 0, "", ans);
        return ans;
    }

    // For testing
    public static void main(String[] args) {
        Question6 q = new Question6();
        System.out.println(q.generateParenthesis(3));
    }
}
