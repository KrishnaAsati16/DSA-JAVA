public class FlattenAMultiLevel {

        // Definition for a Node
        static class Node {
            int val;
            Node prev;
            Node next;
            Node child;

            Node(int val) {
                this.val = val;
            }
        }

        // Solution class
        static class Solution {
            public Node flatten(Node head) {
                if (head == null) return null;

                Node curr = head;

                while (curr != null) {

                    // If no child, move ahead
                    if (curr.child == null) {
                        curr = curr.next;
                    }
                    else {
                        Node next = curr.next;

                        // Flatten child list
                        Node childHead = flatten(curr.child);

                        // Attach child list
                        curr.child = null;
                        curr.next = childHead;
                        childHead.prev = curr;

                        // Move to tail of child list
                        Node temp = childHead;
                        while (temp.next != null) {
                            temp = temp.next;
                        }

                        // Attach remaining list
                        temp.next = next;
                        if (next != null) {
                            next.prev = temp;
                        }

                        curr = next;
                    }
                }
                return head;
            }
        }

        // Print DLL
        static void printList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {

        /*
           Creating this multilevel DLL:
           1 - 2 - 3 - 4
                   |
                   7 - 8
                       |
                       11 - 12
        */

            Node n1 = new Node(1);
            Node n2 = new Node(2);
            Node n3 = new Node(3);
            Node n4 = new Node(4);
            Node n7 = new Node(7);
            Node n8 = new Node(8);
            Node n11 = new Node(11);
            Node n12 = new Node(12);

            // Main list
            n1.next = n2; n2.prev = n1;
            n2.next = n3; n3.prev = n2;
            n3.next = n4; n4.prev = n3;

            // Child lists
            n3.child = n7;
            n7.next = n8; n8.prev = n7;
            n8.child = n11;
            n11.next = n12; n12.prev = n11;

            Solution sol = new Solution();
            Node head = sol.flatten(n1);

            System.out.print("Flattened List: ");
            printList(head);
        }
    }

