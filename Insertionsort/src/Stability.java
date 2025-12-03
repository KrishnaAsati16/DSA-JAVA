//public class Stability {
//    static void main() {
//
//    }
//    class Pair {
//        int value;
//        char id; // identity label
//        Pair(int value, char id) {
//            this.value = value;
//            this.id = id;
//        }
//    }
//
//    public class StableInsertionSort {
//        public static void main(String[] args) {
//            Pair[] arr = {
//                    new Pair(4, 'A'),
//                    new Pair(1, 'B'),
//                    new Pair(4, 'C'),
//                    new Pair(3, 'D')
//            };
//
//            for (int i = 1; i < arr.length; i++) {
//                int j = i;
//                while (j > 0 && arr[j].value < arr[j-1].value) {
//                    Pair temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                    j--;
//                }
//            }
//
//            for (Pair p : arr) {
//                System.out.print("(" + p.value + "," + p.id + ") ");
//            }
//        }
//    }
//}
