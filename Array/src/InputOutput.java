import java.util.Scanner;

public class InputOutput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [] arr = {1,2,3,4,5};
//        System.out.println(arr.length);
//        for (int i=0 ; i<5 ; i++){
//            System.out.println(arr[i]);
//        }
        // input
        int [] krishna= new int [7];
         for(int i = 0; i<=7;i++){
             krishna[i]= sc.nextInt();
         }
         // print
        for (int i=0; i<7;i++){
            System.out.println(krishna[i] + ""); // plus minus divide kar sakte ho
        }
    }
}
