public class ReverseDoublyLinklist {

    // Doubly Linked List Node
    static class DllNode {
        int data;
        DllNode prev;
        DllNode next;

        DllNode(int data) {
            this.data = data;
        }
    }

    // Solution class
    static class Solution {
        public DllNode reverseDll(DllNode head) {
            DllNode prev = null;
            DllNode curr = head;
            DllNode next = null;

            while (curr != null) {
                next = curr.next;     // store next
                curr.next = prev;     // reverse next
                curr.prev = next;     // reverse prev
                prev = curr;          // move prev
                curr = next;          // move curr
            }
            return prev; // new head
        }
    }

    // Print DLL
    static void printList(DllNode head) {
        DllNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create DLL: 1 <-> 2 <-> 3 <-> 4
        DllNode head = new DllNode(1);
        head.next = new DllNode(2);
        head.next.prev = head;
        head.next.next = new DllNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new DllNode(4);
        head.next.next.next.prev = head.next.next;

        System.out.print("Original DLL: ");
        printList(head);

        Solution sol = new Solution();
        head = sol.reverseDll(head);

        System.out.print("Reversed DLL: ");
        printList(head);
    }
}
