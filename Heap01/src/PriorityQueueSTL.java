import java.util.PriorityQueue;

public class PriorityQueueSTL {
    static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(-30);
        System.out.println(pq.peek()); // if we add single element so time complexity -> (log n)
        pq.add(-35);
        System.out.println(pq.peek());  // if we add n number of elements in heap so time complexity ->(n log n)
        System.out.println(pq.size());
        System.out.println(pq.remove());
        System.out.println(pq.size());

        pq.add(5);  pq.add(8);  pq.add(1);  pq.add(2);
        pq.add(3);  pq.add(1);  pq.add(7);  pq.add(6);
        for(int ele : pq){
            System.out.print(ele+" ");
        }
    }
}


 // kaise pta kare ki heap ka sawal h -> 1. kth (smallest , largest, closest ,most frequency)
 //                                        2. continue sorting chal rahi ho