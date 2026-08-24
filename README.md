# ☕ Java DSA Practice

A structured collection of DSA problems solved in Java — covering fundamental data structures, classic algorithms, and common patterns asked in technical interviews. Each solution includes time and space complexity notes.

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=flat&logo=openjdk&logoColor=white)
![LeetCode](https://img.shields.io/badge/LeetCode-Solutions-FFA116?style=flat&logo=leetcode&logoColor=black)
![License](https://img.shields.io/badge/License-MIT-green)

## Topics Covered

| Topic | Patterns |
|---|---|
| Arrays & Strings | Sliding window, two pointers |
| Linked Lists | Singly, doubly, circular |
| Stacks & Queues | Monotonic, deque, BFS |
| Trees | BST, AVL, traversals |
| Graphs | DFS, BFS, Dijkstra, Union-Find |
| Recursion & Backtracking | Permutations, subsets |
| Dynamic Programming | Memoization, tabulation |
| Sorting & Searching | Merge sort, binary search |
| Heaps | Min-heap, top-K problems |
| Hashing | HashMap/HashSet patterns |
| Tries | Prefix trees, word search |
| Bit Manipulation | XOR tricks, bitmasks |

## Structure

java-dsa/
├── arrays/
├── linked-lists/
├── trees/
├── graphs/
├── dynamic-programming/
├── sorting/
└── utils/          ← shared helpers (TreeNode, ListNode, etc.)

## Solution Convention

Each file is self-contained and named after the problem:

```java
/**
 * Problem: Two Sum (LeetCode #1)
 * Difficulty: Easy
 * Approach: HashMap for O(n) lookup
 * Time:  O(n)
 * Space: O(n)
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement))
                return new int[]{map.get(complement), i};
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```

## Prerequisites

- Java 17+
- IntelliJ IDEA, Eclipse, or VS Code with the Java extension

## Running a Solution


## Resources

- [LeetCode](https://leetcode.com)
- [GeeksforGeeks](https://www.geeksforgeeks.org)
- [Java 17 API Docs](https://docs.oracle.com/en/java/javase/17/docs/api/)

## License

MIT
