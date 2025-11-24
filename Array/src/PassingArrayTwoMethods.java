public class PassingArrayTwoMethods {
    static void main() {
        int x[] ={1,2,3};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
        }

    static void change (int[] x) {
        x[2]= 99;
    }
    }