import java.util.Arrays;

public class ShallowCopyDeepDown {
    static void main(String[] args) {
        // shallow -> arr le elements to change karna h basically

        int [] arr = { 1,2,3};
//        int [] x = arr ; // x is a shallow copy
//        x[1] = 500;
//           System.out.println(arr[1]);
//
        int [] deep = Arrays.copyOf(arr,arr.length);
        deep[0]= 100;
        deep[0] = 5000;
        System.out.println(arr[0]);
    }
}
