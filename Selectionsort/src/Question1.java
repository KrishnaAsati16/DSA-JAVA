public class Question1 {
    // Q. find largest element

    static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        int[] arr = {8, 4, 1, 9, -3, 6, 5};
        int n = arr.length;
        print(arr);

        // Selection sort in ascending order
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // After sorting, largest element is at the last index
        System.out.println("Largest element: " + arr[n - 1]);


    }
}