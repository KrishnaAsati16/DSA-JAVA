public class Question2 {
    // MOVE ALL ZEROES TO END
    static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        int[] arr = {0, -2, 0, 0, 2, 0, 7, 2};
        int n = arr.length;
        print(arr);


        for (int j = 1; j <= n - 1; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i]==0) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        print(arr);

    }
}