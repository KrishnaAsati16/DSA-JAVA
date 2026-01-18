import java.util.Stack;

public class BasicSTLOfStack {
    static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
         st.push(50);
         st.push(20);
         st.push(60);
         st.push(8500);
        System.out.println(st.size());
        System.out.println(st); // Auxiliary Space = o(n)
        st.pop();
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop()); // it returns the topmost element and then remove it
    }
}
