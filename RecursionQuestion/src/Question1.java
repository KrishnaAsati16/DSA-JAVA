//GIVEN A NON-NEGATIVE INTEGER n. YOUR TASK IS TO FIND THE nth FIBONACCI NUMBER

public class Question1 {

      public static int fibonacci(int n) {
            // Base cases
            if (n == 0)
                return 0;
            if (n == 1)
                return 1;

            // Recursive call
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

        public static void main(String[] args) {
            int n = 7;
            System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));

}
}





