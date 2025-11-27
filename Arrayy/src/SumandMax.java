public class SumandMax {
    static void main(String[] args) {
        int[] arr = {-6,8,14,-2,23,-47,-7};
//       for(int i = 0; i<arr.length; i++){
//            int sum = 0;
//            sum+=arr[i];
//            System.out.println(sum);

        int max =arr[0];
        for (int i = 0; i <arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.println(max);
    }
}
