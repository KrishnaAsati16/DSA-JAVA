public class GCD {
//    static int hcf(int a, int b) {
//        int hcf = 1;
//        for (int i = 1; i <= Math.min(a, b); i++) {
//            if (a % i == 0 && b % i == 0)
//                hcf = i;
//        }
//        return hcf;
//    }

    public static int hcf(int a, int b) {
        if (b == 0)
            return a;
        return hcf(b, a % b);
    }

    public static void main(String[] args) {
        int a = 36, b = 60;
        System.out.println("HCF = " + hcf(a, b));
    }
}
