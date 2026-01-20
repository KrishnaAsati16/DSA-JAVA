import org.w3c.dom.Node;

import java.util.Stack;

class ListNode{
    int val;
    Node next;
    ListNode(int val){
        this.val=val;
    }

}
//public class RemoveNodes {
//    public ListNode removeNodes(ListNode head) {
//
//        Stack<ListNode> st = new Stack<>();
//        ListNode temp = head;
//
//        while (temp != null) {
//
//            while (!st.isEmpty() && st.peek().val < temp.val) {
//                st.pop();
//            }
//
//            st.push(temp);
//            temp = temp.next;
//        }
//
//        temp = null;
//
//        while (!st.isEmpty()) {
//            ListNode top = st.pop();
//            top.next = temp;
//            temp = top;
//        }
//
//        return temp;
//    }

// leet code 2487

