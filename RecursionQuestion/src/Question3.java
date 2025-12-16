//WAY TO REACH THE Nth STAIR
//  There are n stairs A person standing at the bottom points to reach the top the person can climb either one stair or two stair at the time your task is to count the number of ways the person can reach the top Order does not matter
// Leet cde Q. and GFG

public class Question3 {

     static int countways(int n ){
     if(n==1) return 1;
     if(n==2) return 2;
     return countways(n-1)+countways(n-2);
    }

    static void main(String[] args) {
        int n = 5;
        System.out.println("Number of ways to climb " + n + " steps: " + countways(n));
    }

}
