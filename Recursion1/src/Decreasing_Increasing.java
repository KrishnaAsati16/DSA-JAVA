public class Decreasing_Increasing {
    public static int reverse(int n , int r){
        if(n==0) return r;
       return reverse(n/10,r*10+n%10);
    }
    static void main(String[] args) {
        int n = 5245;
//        while(n!=0){
//            r=r*10 +(n%10);
//            n=n/10;
//        }
        System.out.println(reverse(n,0));
    }

}
