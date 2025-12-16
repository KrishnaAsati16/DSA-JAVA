public class RecursionONArray {
    static void main(String[] args) {
        int[] arr={5,3,7,12,76,9,34,5};
        recprint(arr,0);
    }
    public static void recprint(int[] arr, int idx){
       int n = arr.length;
       if(idx ==n) return;
       System.out.print(arr[idx]+" ");
        recprint(arr,idx+1);
    }
}
