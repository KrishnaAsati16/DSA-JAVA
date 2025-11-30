import java.util.Scanner;

public class Example{
    static void main() {
        Scanner sb =  new Scanner(System.in);
        //Q. GIVEN AN ARRAY OF SIZE N+1 CONSISTING OF INTEGERS FROM 1 TO N . ONE OF THE ELEMENTS IS DUPLICATE IN THE ARRAY. FIND THE DUPLICATE ELEMENTS?
        //APPROACH 1 -> NESTED LOOP
        // NUMBER OF OPERATION MATTER HOGA
       int[] arr = {5,1,3,4,2,4};
           //NUMBER OF OPERATION= 5+4+3+2
        // code
        int n = arr.length;

//        for(int i=0; i<n;i++){
//            for(int j=0;j<n;j++){
//                if(arr[i]==arr[j]) {
        // break;
//                }
//                }
//            }
//        System.out.println("Duplicate element: " + arr[i]);

        // APPROACH 2 -> BOOLEAN FLAG
        // total operation=6

//       boolean[] flag = new boolean[n+1] ;
//       for (int i = 0;i<n; i++){
//           int ele=arr[i];
//           if(flag[ele]==true)
//               else flag[ele]=true;
//
//       }
             // APPROCH 3
        //##BEST
//        arr={5,1,3,4,2,4};
//        sumarray =5+1+3+4+2+4;=19
//                sum 1to5= 5*6/2=15;
//        arr.length=1to5;
//        19-15=4
//                total operation= 5;
//

    }
    }

