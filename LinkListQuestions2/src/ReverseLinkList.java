public class ReverseLinkList {
//    class Solution {
//        public ListNode reverseList(ListNode head) {
//            if (head == null || head.next == null)
//                return head;
//
//            ArrayList<ListNode> arr = new ArrayList<>();
//            ListNode temp = head;
//
//            while (temp != null) {
//                arr.add(temp);
//                temp = temp.next;
//            }
//
//            int n = arr.size();
//
//            for (int i = n - 1; i > 0; i--) {
//                arr.get(i).next = arr.get(i - 1);
//            }
//
//            arr.get(0).next = null;   // old head becomes tail
//
//            return arr.get(n - 1);    // new head
//        }
//    }

}

//leet code 206

//OR
//
//public ListNode reverseList(ListNode head) {
//    ListNode cur = head;
//    ListNode prev = null;
//    ListNode fwd = null;
//    while(cur !=null)
//    {
//        fwd = cur.next;
//        cur.next = prev;
//        prev = cur;
//        cur = fwd;
//    }
//    return prev;
//}