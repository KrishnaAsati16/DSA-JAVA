public class CountInversion {

        static int inversioncount(int arr[]) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] > arr[j])
                        count++;
                }
            }
            return count;
        }

    static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int result = inversioncount(arr);
        System.out.println("Number of inversions: " + result);

    }
    }

// time complexity n^2