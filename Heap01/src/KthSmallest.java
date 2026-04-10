import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        int result = kthSmallest(arr, k);
        System.out.println("Kth Smallest Element: " + result);
    }
        public static int kthSmallest(int[] arr, int k) {
            // maxheap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            pq.add(ele); // log k
            if(pq.size()>k) pq.remove(); // log k
        }
        return pq.peek();
        }
    }