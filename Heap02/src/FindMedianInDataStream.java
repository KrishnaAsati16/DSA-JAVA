import java.util.ArrayList;
import java.util.Collections;

class MedianFinder {                // we are creating a data structure
               ArrayList<Integer> arr;

        public MedianFinder() {
              arr = new ArrayList<>();
        }

        public void addNum(int num) {
             arr.add(num);
        }

        public double findMedian() {
           Collections.sort(arr);
           int n = arr.size();
           if(n%2 ==1) return (double)(arr.get(n/2));
           else{
               return (arr.get(n/2) + arr.get(n/2-1))/2.0;
           }
        }
    }
    public class FindMedianInDataStream {
        static void main(String[] args) {
            MedianFinder m  = new MedianFinder();

        }
}
