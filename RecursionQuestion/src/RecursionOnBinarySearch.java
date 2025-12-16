// Given an arr off integer which is sorted in ascending order and an integer target Write a function to search target in numbers If target exists then its index otherwise return -1.
// LEET CODE 704

            public class RecursionOnBinarySearch {


                    // Recursive binary search function
                    public static int binarySearch(int[] nums, int target, int left, int right) {

                        // Base case: element not found
                        if (left > right) {
                            return -1;
                        }

                        int mid = left + (right - left) / 2;

                        // If target is found
                        if (nums[mid] == target) {
                            return mid;
                        }

                        // If target is smaller, search left half
                        if (target < nums[mid]) {
                            return binarySearch(nums, target, left, mid - 1);
                        }

                        // If target is larger, search right half
                        return binarySearch(nums, target, mid + 1, right);
                    }

                    // Main method to test the function
                    public static void main(String[] args) {
                        int[] nums = {2, 4, 6, 8, 10, 12, 14};
                        int target = 10;

                        int result = binarySearch(nums, target, 0, nums.length - 1);

                        if (result != -1) {
                            System.out.println("Target found at index: " + result);
                        } else {
                            System.out.println("Target not found");
                        }
                    }
                }


