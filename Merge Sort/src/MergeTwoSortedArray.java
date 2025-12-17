public class MergeTwoSortedArray {

//        public static void main(String[] args) {
//            int[] arr1 = {1, 2, 3, 45, 50, 60};
//            int[] arr2 = {8, 9, 10, 11, 12, 13};
//            int[] merged = new int[arr1.length + arr2.length];
//
//            merge(arr1, arr2, merged);
//
//            // Print merged array
//            for (int num : merged) {
//                System.out.print(num + " ");
//            }
//        }
//
//        public static void merge(int[] arr1, int[] arr2, int[] c) {
//            int i = 0, j = 0, k = 0;
//
//            // Merge until one array is exhausted
//            while (i < arr1.length && j < arr2.length) {
//                if (arr1[i] <= arr2[j]) {
//                    c[k++] = arr1[i++];
//                } else {
//                    c[k++] = arr2[j++];
//                }
//            }
//
//            // Copy remaining elements
//            while (i < arr1.length) {
//                c[k++] = arr1[i++];
//            }
//            while (j < arr2.length) {
//                c[k++] = arr2[j++];
//            }
//        }
public static void main(String[] args) {
    int[] a = {3,8,11,17,21}; // m
    int[] b = {5,9,42,60}; // n
    int[] c = new int[a.length+b.length];
    merge(a,b,c);
    print(c);
}

    private static void print(int[] c) {
        for(int ele : c){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    private static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
    }
// easy