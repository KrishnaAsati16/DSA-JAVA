import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversalQueue {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Input: 10 15 20 25 30
        q.add(10);
        q.add(15);
        q.add(20);
        q.add(25);
        q.add(30);

        ReversalQueue obj = new ReversalQueue();

        Queue<Integer> result = obj.reverseQueue(q);

        // Print reversed queue
        System.out.println("Reversed Queue:");
        while (!result.isEmpty()) {
            System.out.print(result.remove() + " ");
        }
    }

    public Queue<Integer> reverseQueue(Queue<Integer> q) {
        // code here
     Stack<Integer> st = new Stack<>();
     while(q.size()>0){
         st.push(q.remove());
     }
     while(st.size()>0){
         q.add(st.pop());
     }
     return q ;
    }
}
