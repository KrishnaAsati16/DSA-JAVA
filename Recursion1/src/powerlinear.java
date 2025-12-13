import java.util.Scanner;

// Q.'a' raised to the power 'b'

public class powerlinear {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base:");
        int a = sc.nextInt();
        System.out.println("enter expo:");
        int b = sc.nextInt();
        System.out.println("raised to the power" + b + " is" + pow(a, b));

    }
       // APPROACH 1
//    public static int pow(int a, int b) {
//        if(b==0)
//            return 1;
//        return a*pow(a,b-1);
//    }
             // APPROACH 2

    public static int pow(int a, int b) {
        if(b==0) return 1 ;
        int call = pow(a,b/2);
        if(b%2==0) return call*call;
        return a*call;
    }
}
