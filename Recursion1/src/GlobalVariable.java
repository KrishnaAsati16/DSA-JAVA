public class GlobalVariable {
    static  int x =10;

    static void main(String[] args) {
      //  fun();
        int x = 9; // change
        System.out.println(x);
        //int x =5;
        System.out.println(x);
        x= 6;
    }
    public static void fun(){
        x=20;
        int x = 6;
    }
}
