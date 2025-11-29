import java.util.ArrayList;

public class Basic {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); // size = 0!
        arr.add(25); // add means last se add ho ra h
        arr.add(21);
        arr.add(7);
        arr.add(5);
        arr.add(10);
        System.out.println(arr.get(1)); // Access kar na h to get karo
        arr.set(2, 800); // arr[2]=800

        // print all arraylist so
        System.out.println(arr); // not traversing the array by ourselves

        int n = arr.size(); // arr.length

        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        // 25,21,800,5,10,25
        arr.add(70);//it means arr look like this 25 21 800 5 10 25 70
          arr.add(1,100); // it means arr look like this 25  100 21 800 5 10 25
        System.out.println(arr);

        // for remove
        arr.remove(arr.size()-1);
        System.out.println(arr);

        // reverse
       // arr.reversed();
        System.out.println(arr);

    }

}
