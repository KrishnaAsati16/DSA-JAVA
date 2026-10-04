public class NthFibCode {
    class Solution{
        static int [] dp;
        public int fibo(int n){
            if(n<=1) return n;
            if(dp[n]!=0) return dp[n];  // extra
            int ans = fibo(n-1) + fibo(n-2);
            dp[n] = ans;  // extra
            return ans;
        }
        public int nthFibonacci(int n){
            dp = new int[n+1];
            return fibo(n);
        }

    }
}


// using memoization or top down dp or recursive dp

// t.c ->o(n)