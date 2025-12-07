public class Question3 {
    // PRINT ELEMENTS OF 2D ARRAY COLUMN-WISE
    static void main(String[] args) {
        int[][] arr = {{6, 0, 2, 7, 6}, {1, 3, 7, 20, 2,}, {9, 9, 4, 5, 2}};
//        for(int i = 0;i<arr.length;i++) {
//            System.out.print(arr[i][0]+" ");
//        }
//        System.out.println();
//        for(int i = 0;i<arr.length;i++) {
//            System.out.print(arr[i][1]+" ");
//        }
//        System.out.println();
//        for(int i = 0;i<arr.length;i++) {
//            System.out.print(arr[i][2]+" ");
//        }
//        System.out.println();
//        for(int i = 0;i<arr.length;i++) {
//            System.out.print(arr[i][3]+" ");
//        }
//        System.out.println();
//        for(int i = 0;i<arr.length;i++) {
//            System.out.print(arr[i][4]+" ");
//        }
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
