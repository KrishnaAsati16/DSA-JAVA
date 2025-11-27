import java.util.Arrays;

public class ArraySortBuildIn {
    static void main(String[] args) {
        // sort - > ascending order
        int[] arr = {-3,-1,-96,5,4,8,0,117,69};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
