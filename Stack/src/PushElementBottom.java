//PushElementBottom (recursively)

import java.util.Stack;

public class PushElementBottom {
    static void main(String[] args) {
        Stack <Integer> st = new Stack<>();

        st.push(50); // bottom
        st.push(20);
        st.push(80);
        st.push(100);
        st.push(85); // top
        int ele = 120;
        System.out.println(st);
        pushAtBottom(st,ele);
    }

    private static void pushAtBottom(Stack<Integer>st , int ele ){
        if(st.size()==0)
        {
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,ele);
        st.push(top);
    }
}
