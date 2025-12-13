public class FunctionCallingItself {
//    static void main(String[] args) {
//        bkl();
//    }
//    public static void bkl(){       // function ke under parameter pass kr ke
//        System.out.println("A");
//        //bkl();;
//    }

    // Function calling

static void main(String[] args) {
    bkl(1);
}
    public static void bkl(int n){// function ke under parameter pass kr ke
    if(n==10) // base case
        return;
    System.out.println("A"); //work
        bkl(n+1);; // call
    }
}
