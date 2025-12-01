public class bubblesort {
    static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 8, 7, 2};
        int n = arr.length;
        print(arr);

        // APPROCH 1 CHECK KARKE SWAPPING HO RAHI H
//        for (int i = 0; i < n-1; i++) {
//            if (arr[i] > arr[i+1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        for (int i = 0; i < n-1; i++) {
//            if (arr[i] > arr[i+1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        for (int i = 0; i < n-1; i++) {
//            if (arr[i] > arr[i+1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        for (int i = 0; i < n-1; i++) {
//            if (arr[i] > arr[i+1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        for (int i = 0; i < n-1; i++) {
//            if (arr[i] > arr[i+1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        for (int i = 0; i < n-1; i++) {
//            if (arr[i] > arr[i+1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        for (int i = 0; i < n-1; i++) {
//            if (arr[i] > arr[i+1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        print(arr);

        // APPROACH 2 THIS IS CALLED BUBBLE SORT
        for (int j = 1; j <= n - 1; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    print(arr);
    }
}

