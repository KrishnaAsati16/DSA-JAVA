public class CircularTraversal {
    class Solution {

        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        static void traverse(Node head) {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }

        public static void main(String[] args) {
            // Creating nodes
            Node n1 = new Node(10);
            Node n2 = new Node(20);
            Node n3 = new Node(30);
            Node n4 = new Node(40);

            // Making circular linked list
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = n1;   // circular link

            Node head = n1;

            // Traversal
            traverse(head);
        }
    }

}
