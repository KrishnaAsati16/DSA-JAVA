import java.util.Scanner;

public class Print1ToNOpposite {

//    static void main(String[] args) {
//        Scanner sb = new Scanner(System.in);
//        int n = sb.nextInt();
//        print(1,n);
//    }
//    public static void print( int x,int n){
//        if(x>n)
//            return;
//        System.out.println(x);
//        print(x+1,n);
//    }
}

// problem done using 2 variable
// because of stopping condition



// USING ONE VARIABLE BY->GLOBAL VARIABLE

      static  int n; // indicate as a red flag
                     // so use 2 variable

       static void main(String[] args) {
           Scanner sb = new Scanner(System.in);
             n = sb.nextInt();
            print(1);
}
public static void print( int x){
    if(x>n)
        return;
    System.out.println(x+" ");
    print(x+1);
}


