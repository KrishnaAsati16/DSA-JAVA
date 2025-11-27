public class productofarray {
    static void main(String[] args) {
        // product of array
        int [] arr={1,2,3,6};
        int product = 1; // Initialize  kiya
        for(int i=0; i<arr.length;i++){
            product *=arr[i];

        }

        System.out.println(product);
    }

}
