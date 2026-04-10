import java.util.PriorityQueue;

public class NearlySorted {
    public void NearlySorted(int [] arr, int k){
        int idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr){
            pq.add(ele);
            if(pq.size()>k) arr[idx++] = pq.remove();
        }
        while(pq.size()>0){
            arr[idx++] = pq.remove();
        }
    }

//    static void main(String[] args) {
//        int[] arr = {7, 10, 4, 3, 20, 15};
//        int k = 3;
//
//        int result = NearlySorted(arr, k);
//        System.out.println(NearlySorted + result);
//    }
}
