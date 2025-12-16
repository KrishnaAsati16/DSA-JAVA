//Nth Fibonacci Number

public class Question2 {
          public int nthfibonacci(int n){
              if(n==1)
                  return n;
              return nthfibonacci(n-1)+nthfibonacci(n-2);
          }

    static void main(String[] args) {
        int n =7;
        System.out.println("Fibonacci number at position " + n + " is: " + Question1.fibonacci(n));
    }

}

//LEET CODE
