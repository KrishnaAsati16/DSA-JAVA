import java.util.Scanner;

public class PrintNegativeValue {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextByte();
              int[] arr= new int[n];
        System.out.println("enter array elements:");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextByte();
        }

        // printing negative values
        for (int i = 0; i<n; i++){
           if(arr[i]<0) // condition  lada de
               System.out.println(arr[i] + "");
        }
    }
}
