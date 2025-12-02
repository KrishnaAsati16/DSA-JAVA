public class basic {
    // (SELECTED SMALLEST ELEMENT)
    // swap kar diya smallest element sabse first me
    // arr = {8,4,1,9,-3,6,5} har pass me 1 element swap ho raha h
    // arr = {-3,4,1,9,8,6,5}
    // arr = {-3,1,4,9,8,6,5}
    // some aasa he hoga
    // final arr = {-3,1,4,5,6,8,9}
    static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        int[] arr = {8,4,1,9,-3,6,5};
        int n = arr.length;
        print(arr);

        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;

        }
        print(arr);


    }
}
