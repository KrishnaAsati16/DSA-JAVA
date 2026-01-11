public class CriticalPoints {

        // Definition for singly-linked list
        static class ListNode {
            int val;
            ListNode next;

            ListNode(int val) {
                this.val = val;
            }
        }

        static class Solution {
            public int[] nodesBetweenCriticalPoints(ListNode head) {

                int[] ans = {-1, -1};

                // At least 3 nodes required
                if (head == null || head.next == null || head.next.next == null)
                    return ans;

                int idx = 1;
                int firstIdx = -1;
                int lastIdx = -1;
                int minDist = Integer.MAX_VALUE;

                ListNode a = head;
                ListNode b = head.next;
                ListNode c = head.next.next;

                while (c != null) {

                    // Check for critical point
                    if ((b.val > a.val && b.val > c.val) ||
                            (b.val < a.val && b.val < c.val)) {

                        if (firstIdx == -1) {
                            firstIdx = idx;
                        }

                        if (lastIdx != -1) {
                            minDist = Math.min(minDist, idx - lastIdx);
                        }

                        lastIdx = idx;
                    }

                    idx++;
                    a = a.next;
                    b = b.next;
                    c = c.next;
                }

                // If less than two critical points
                if (firstIdx == -1 || firstIdx == lastIdx)
                    return ans;

                ans[0] = minDist;
                ans[1] = lastIdx - firstIdx;

                return ans;
            }
        }

        // Main method for testing
        public static void main(String[] args) {

        /*
            Test case:
            Linked List: 1 -> 3 -> 2 -> 2 -> 3 -> 2 -> 2 -> 2 -> 7

            Critical points at indices:
            1 (3), 4 (3), 8 (7)
         */

            ListNode head = new ListNode(1);
            head.next = new ListNode(3);
            head.next.next = new ListNode(2);
            head.next.next.next = new ListNode(2);
            head.next.next.next.next = new ListNode(3);
            head.next.next.next.next.next = new ListNode(2);
            head.next.next.next.next.next.next = new ListNode(2);
            head.next.next.next.next.next.next.next = new ListNode(2);
            head.next.next.next.next.next.next.next.next = new ListNode(7);

            Solution sol = new Solution();
            int[] result = sol.nodesBetweenCriticalPoints(head);

            System.out.println("Min Distance = " + result[0]);
            System.out.println("Max Distance = " + result[1]);
        }
    }

// leet code 2058
// G faad code