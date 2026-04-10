import java.util.PriorityQueue;

public class MinimumCostToConnectRoots {
        public static int minCost(int[] arr) {
            // Step 1: Create a min-heap
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            // Step 2: Add all ropes to heap
            for (int ele : arr) {
                pq.add(ele);
            }

            int cost = 0;

            // Step 3: Keep combining two smallest ropes
            while (pq.size() > 1) {
                int first = pq.poll();   // smallest rope
                int second = pq.poll();  // next smallest rope

                int newRope = first + second;
                cost += newRope;         // add cost

                pq.add(newRope);         // push back combined rope
            }

            return cost;
        }

        // Quick test
        public static void main(String[] args) {
            int[] ropes = {4, 3, 2, 6};
            System.out.println(minCost(ropes)); // Output: 29
        }
    }
