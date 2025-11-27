public class ReverseArrayTwoVariable_PointerTechnique {
    static void main(String[] args) {


        // reverse array (2variable/pointer technique)
           // logic-> use 2 variable i,j i=index 0th && j=index last (n-1);
         // while(i<j) tb tk collision nhi ho ta
        // swap (arr[i],arr[j])
        // i++;
         //j__;

                //  method 1

        int[] arr =  {4,6,9,8,7,5,58,69,78};
        int n = arr.length;
        int i=0 , j=n-1;
         while (i<j){
             int temp= arr[i];
             arr[i]=arr[j];
             arr[j]= temp;
             i++;
             j--;
         }
         for(int ele: arr)
             System.out.println( ele+"");

        // method 2
//         for(int i=0;i<n/2;i++){
//             // swap arr[i] and arr[n-1-i]
//
//             int temp=arr[i];
//             arr[i]= arr[n-1-i];
//             arr[n-1-i]=temp;
//
//         }
//        for(int ele: arr)
//             System.out.println( ele+"");

        // method 3

//        int i=2 , j=5;
//         while (i<j){
//             int temp= arr[i];
//             arr[i]=arr[j];
//             arr[j]= temp;
//             i++;
//             j--;
//         }
//         for(int ele: arr)
//             System.out.println( ele+"");
//
//

    }
}
