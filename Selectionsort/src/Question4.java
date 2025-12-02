import java.util.*;
public class Question4 {


    public class UnionUsingSelectionSort {
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

        // Find Union
        public static void findUnion(int[] arr1, int[] arr2) {
            selectionSort(arr1);
            selectionSort(arr2);

            int i = 0, j = 0;
            List<Integer> union = new ArrayList<>();

            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] == arr2[j]) {
                    if (!union.contains(arr1[i])) {
                        union.add(arr1[i]);
                    }
                    i++;
                    j++;
                } else if (arr1[i] < arr2[j]) {
                    if (!union.contains(arr1[i])) {
                        union.add(arr1[i]);
                    }
                    i++;
                } else {
                    if (!union.contains(arr2[j])) {
                        union.add(arr2[j]);
                    }
                    j++;
                }
            }

            // Add remaining elements
            while (i < arr1.length) {
                if (!union.contains(arr1[i])) {
                    union.add(arr1[i]);
                }
                i++;
            }
            while (j < arr2.length) {
                if (!union.contains(arr2[j])) {
                    union.add(arr2[j]);
                }
                j++;
            }

            System.out.println("Union: " + union);
        }

        public static void main(String[] args) {
            int[] arr1 = {7, 0, 4, 3, 2, 8, 10};
            int[] arr2 = {5, 2, 8, 7, 1, 0};

            findUnion(arr1, arr2);
        }

    }
}