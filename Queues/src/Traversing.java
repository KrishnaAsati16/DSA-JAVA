import java.util.LinkedList;
import java.util.Queue;

public class Traversing {
    private static void display(Queue<Integer>q){
        int n = q.size();
        // System.out.println(q.peek());
        for(int i=1; i<=n;i++){
            System.out.println(q.peek());
            q.add(q.remove());
        }
    }
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
            q.add(q.remove());
        addAtIndex(q,2,60);
        display(q);
        remove(q,3);
        display(q);
    }

    private static void addAtIndex(Queue<Integer>q, int idx, int val) {
       int n = q.size();
       for(int i =1;i<=idx;i++){
           q.add(q.remove());
       }
       q.add(val);
        for(int i =1;i<=n-idx;i++){
            q.add(q.remove());
        }
    }

    private static int peek( Queue<Integer>q, int idx) {


         return -1;
    }

    private static int remove( Queue<Integer>q ,int idx ) {
        int n = q.size();
        for(int i =1;i<=idx;i++){
            q.add(q.remove());
        }
        q.remove(idx);
        for(int i =1;i<= q.size()-2;i++){
            q.add(q.remove());
        }
        return -1;
    }
}
