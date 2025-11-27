import java.util.Scanner;

public class MaxElement {
    //    Scanner sc = new Scanner(System.in);

//    int [] arr = {1,5,8,6,98,78,45};
//    int max = arr[0];
//    for(int i=0; i<arr.length;i++){
//     if(arr[i] > max) max = arr[i];
//        System.out.println(max);
//    }
//}

    public class maxelemrnt {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] arr = {1, 5, 8, 6, 98, 78, 45};
            int max = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println("Maximum element is: " + max);
        }
    }
}
