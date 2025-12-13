import java.util.Scanner;

public class Print1ToN {
    static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0)
            return;
        System.out.println(n);
        print(n-1); //-> subproblem
    }
}

// print(n)-> prints"n" & print(n-1) will take care of rest


