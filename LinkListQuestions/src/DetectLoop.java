import java.util.HashSet;

public class DetectLoop {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    static class java {
        static boolean detectLoop(Node head) {
            HashSet<Node> st = new HashSet<>();

            while (head != null) {
                if (st.contains(head))
                    return true;

                st.add(head);
                head = head.next;
            }
            return false;
        }

        public static void main(String[] args) {

            Node head = new Node(1);
            head.next = new Node(3);
            head.next.next = new Node(4);

            // create loop
            head.next.next.next = head.next;

            if (detectLoop(head))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
