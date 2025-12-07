public class sum {
    static void main(String[] args) {
        int[][] arr = {{0, 3, 9}, {0, 8, 5}, {1, 0, 5}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = +arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
