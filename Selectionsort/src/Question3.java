public class Question3 {
    // common elements

        // Selection Sort
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
            selectionSort(arr);
            int left = 0, right = arr.length - 1;
            boolean found = false;

            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) {
                    System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
                    found = true;
                    break;
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

        // Find common elements between two arrays
        public static void findCommon(int[] arr1, int[] arr2) {
            selectionSort(arr1);
            selectionSort(arr2);

            int i = 0, j = 0;
            System.out.print("Common elements: ");
            boolean found = false;

            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    found = true;
                    i++;
                    j++;
                } else if (arr1[i] < arr2[j]) {
                    i++;
                } else {
                    j++;
                }
            }

            if (!found) {
                System.out.print("None");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] arr = {7, 0, 4, 3, 2, 8, 10};
            int target = 12;

            findPair(arr, target);

            int[] arr1 = {7, 0, 4, 3, 2, 8, 10};
            int[] arr2 = {5, 2, 8, 7, 1, 0};
            findCommon(arr1, arr2);
        }
    }
