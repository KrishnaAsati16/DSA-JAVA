import java.util.ArrayList;

public class Arraylist {
    static void main() {
        ArrayList<Integer> a= new ArrayList<>();
        a.add(3);
        a.add(23);
        a.add(93);

        ArrayList<Integer> b= new ArrayList<>();
        b.add(9993);
        b.add(365);
        b.add(325);

        ArrayList<Integer> c= new ArrayList<>();
        c.add(53);
        c.add(993);
        c.add(93);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);

        //System.out.println(arr);

        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
