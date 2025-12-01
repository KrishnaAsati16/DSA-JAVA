public class Question1 {
        static boolean isSorted(int[] arr) {

         //   Q. GIVEN AN ARRAY
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false;   // Not sorted
                }
            }
            return true; // Sorted
        }

        public static void main(String[] args) {
            int[] arr = {1, 5, 8, 9};

            boolean result = isSorted(arr);
            System.out.println(result);
        }
    }

