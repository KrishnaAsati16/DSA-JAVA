//public class Segregate0sand1s {
//    static void main(String[] args) {
//      void  Segregate0and1(int[] arr)
//        {
//          // two pass solution
//          int numberofZeros =0;
//          int numberofones =0;
//          for(int ele: arr){
//              if(ele==0) numberofZeros++;
//              else numberofones++;
//          }
//          for(int i=0;i<numberofZeros;i++){
//              arr[i] =0;
//          }
//          for(int i=numberofZeros;i<arr.length;i++){
//              arr[i] =1;
//          }
//        }
//
//
//        public class Segregate0sand1s {
//
//            // function to segregate 0s and 1s
//            static void Segregate0and1(int[] arr) {
//
//                int numberofZeros = 0;
//
//                // Count zeros
//                for (int ele : arr) {
//                    if (ele == 0) numberofZeros++;
//                }
//
//                // Fill zeros
//                for (int i = 0; i < numberofZeros; i++) {
//                    arr[i] = 0;
//                }
//
//                // Fill ones
//                for (int i = numberofZeros; i < arr.length; i++) {
//                    arr[i] = 1;
//                }
//            }
//
//            public static void main(String[] args) {
//
//                int[] arr = {0, 1, 1, 0, 1, 0, 0};
//
//                Segregate0and1(arr);
//
//                for (int x : arr) System.out.print(x + " ");
//            }
//        }
//    }
