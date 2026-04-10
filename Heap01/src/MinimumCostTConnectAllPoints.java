import java.util.*;
public class MinimumCostTConnectAllPoints {

    class Solution {
        public int minCostConnectPoints(int[][] points) {
            int n = points.length;

            // min heap -> {cost, node}
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

            boolean[] visited = new boolean[n];

            pq.add(new int[]{0, 0}); // start from node 0
            int cost = 0;
            int edges = 0;

            while (edges < n) {
                int[] curr = pq.poll();
                int currCost = curr[0];
                int u = curr[1];

                if (visited[u]) continue;

                visited[u] = true;
                cost += currCost;
                edges++;

                // add all neighbors
                for (int v = 0; v < n; v++) {
                    if (!visited[v]) {
                        int dist = Math.abs(points[u][0] - points[v][0]) +
                                Math.abs(points[u][1] - points[v][1]);

                        pq.add(new int[]{dist, v});
                    }
                }
            }

            return cost;
        }
    }
}
