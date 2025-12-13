public class FactorialOfANumber {

    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        int ans = n * factorial(n - 1);
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
// leet code or gfg
