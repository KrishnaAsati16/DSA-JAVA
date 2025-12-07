import java.util.Scanner;

public class OutputInput {
    static void main(String[] args) {
        int [][] arr = new int[3][4]; //{{0,0,0,0},{{0,0,0,0},{{0,0,0,0}}
//        for(int i=0; i<4;i++){
//            for(int j = 0;j<4;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        int [][] arr ={{0,3,9},{0,8,5},{1,0,5}};
//        for(int i=0; i<arr.length;i++){
//            for(int j = 0;j< arr.length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//
        Scanner sc = new Scanner(System.in);
       // int [][] arr ={{0,3,9},{0,8,5},{1,0,5}};
        for(int i=0; i<arr.length;i++){
            for(int j = 0;j< arr.length;j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
