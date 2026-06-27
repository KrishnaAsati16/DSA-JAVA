public class singlenumber {
    static void main(String[] args) {
        int arr [] = {1,2,3,4,1,3,4};
        // output

    }

    class solution{
        int getSingle(int arr[]){
            int xor = 0;
            for(int ele: arr){
                xor = xor^ele;
            }
            return xor;
        }
    }
}
