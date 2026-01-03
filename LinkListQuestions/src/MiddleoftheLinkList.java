//Q.give the head of a linklist the task id to find the middle .for ex -> 1,2,3,4,5 is 3. if there is two middle
//node(event count ) return the second middle for ex -> 1,2,3,4,5,6 is 4

public class MiddleoftheLinkList {


        // Node class
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // Find middle element
        public static int getMiddle(Node head) {
            int length = 0;
            Node temp = head;

            // Count length
            while (temp != null) {
                length++;
                temp = temp.next;
            }

            // Move to middle
            temp = head;
            for (int i = 0; i < length / 2; i++) {
                temp = temp.next;
            }

            return temp.data;
        }

        public static void main(String[] args) {
            // Create linked list: 10 -> 20 -> 30 -> 40 -> 50
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);
            head.next.next.next.next = new Node(50);
            head.next.next.next.next.next = new Node(60);
            head.next.next.next.next.next.next = new Node(70);
            head.next.next.next.next.next.next.next = new Node(80);

            System.out.println("Middle element: " + getMiddle(head));
        }
    }


