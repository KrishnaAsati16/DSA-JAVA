import java.util.HashSet;

public class FindDistinctelements {
    class Solution {
        static int distinct(int arr[]) {
            // code here
            HashSet<Integer> set = new HashSet<>();
            for(int ele : arr) set.add(ele);
            return set.size() ;
        }
    }
    }
