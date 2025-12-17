// STEP1-> Make 2 Empty Arrays Of Size N/2 Each & Copy Paste Arr Elements To Them
//CONDITION->
// IF ARRAY IS ODD SO PARTS IS SPLIT IN N/2 AND PART IS N-N/2
// STEP2->Merge


public class MergeSortUsingMagic {
    static void main(String[] args) {
        int[] arr = {5, 4, 2, 1, 8, 9, 60, 14, 5};
        mergeSort(arr);
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        // step1-> create two new empty arr of size n/2

        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // step2-> copy paste arr into a and b
        int idx = 0; // idx travel arr pe
        for (int i = 0; i < a.length; i++)
            a[i] = arr[idx++];
        for (int i = 0; i < b.length; i++)
            b[i] = arr[idx++];

        // step3-> magic
        mergeSort(a);
        mergeSort(b);

        // step4-> Merge 'a' and 'b' into arr
        merge(a, b, arr);


    }

    public static void merge(int[] arr1, int[] arr2, int[] c) {
        int i = 0, j = 0, k = 0;

        // Merge until one array is exhausted
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                c[k++] = arr1[i++];
            } else {
                c[k++] = arr2[j++];
            }
        }

        // Copy remaining elements
        while (i < arr1.length) {
            c[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            c[k++] = arr2[j++];
        }
    }
}
