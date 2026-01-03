//public class KthNodeFromEnd {
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    int getkthfromlast(Node head, int k) {
//        Node slow = head;
//        Node fast = head;
//        for (int i = 1; i <= k; i++) {
//            fast = fast.next;
//        }
//        while (fast != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return slow.data;
//    }
//
//    static void main(String[] args) {
//        int k = 2;
//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//        head.next.next.next = new Node(40);
//        head.next.next.next.next = new Node(50);
//        head.next.next.next.next.next = new Node(60);
//
//        System.out.println(getkthfromlast(head, k));
//       // System.out.println(getkthfromlast(head, k);
//
//    }
//}


public class KthNodeFromEnd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static int getkthfromlast(Node head, int k) {
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= k; i++) {
            if (fast == null) return -1; // safety check
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {
        int k = 2;

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.println(getkthfromlast(head, k)); // Output: 50
    }
}


// leet code 19
// leet code1721