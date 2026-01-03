//import java.util.Set;
//
public class FindFirstNodeINDetectLoop {
//    class Node {
//        constructor(x) {
//            this.data = x;
//            this.next = null;
//        }
//    }
//
//    function cycleStart(head) {
//        let visited = new Set();
//        let currNode = head;
//
//        // Traverse the linked list
//        while (currNode !== null) {
//
//            // If current node already in set → loop start
//            if (visited.has(currNode)) {
//                return currNode.data;
//            }
//
//            visited.add(currNode);
//
//            currNode = currNode.next;
//        }
//
//        return -1;
//    }
//
//// Driver Code
//
//    let head = new Node(1);
//    head.next = new Node(2);
//    head.next.next = new Node(3);
//    head.next.next.next = new Node(4);
//    head.next.next.next.next = new Node(5);
//    head.next.next.next.next.next = new Node(6);
//
//    head.next.next.next.next.next = head.next.next;
//
//    let loopNode = cycleStart(head);
//
//if (loopNode !== -1)
//            console.log(loopNode);
//else
//        console.log(-1);
}
