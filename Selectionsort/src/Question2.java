public class Question2 {
    // Q. sum find a pair with given sum
    // arr = {7,0,4,3,2,8,10}


        public static void selectionSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                // Swap
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        // Find pair with given sum
        public static void findPair(int[] arr, int target) {
            // First sort the array
            selectionSort(arr);

            int left = 0;
            int right = arr.length - 1;

            boolean found = false;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) {
                    System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
                    found = true;
                    break; // stop after finding one pair
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }

            if (!found) {
                System.out.println("No pair found with sum " + target);
            }
        }

        public static void main(String[] args) {
            int[] arr = {7, 0, 4, 3, 2, 8, 10};
            int target = 12; // Example sum

            findPair(arr, target);
        }
    }















