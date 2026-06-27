// check if kth bit is set or not

public class CheckKthBit {
    class CheckBit{
        static boolean checkkthBit(int n, int k){
            return ((n>>k) %2 ==1);
        }
    }
}
