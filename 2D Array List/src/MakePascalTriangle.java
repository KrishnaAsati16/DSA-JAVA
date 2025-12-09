import java.util.ArrayList;
import java.util.List;

public class MakePascalTriangle {

    public class Arraylist {
        static void main() {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(3);
            a.add(23);
            a.add(93);

            ArrayList<Integer> b = new ArrayList<>();
            b.add(9993);
            b.add(365);
            b.add(325);

            ArrayList<Integer> c = new ArrayList<>();
            c.add(53);
            c.add(993);
            c.add(93);

            ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
            arr.add(a);
            arr.add(b);
            arr.add(c);

            //System.out.println(arr);

            for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < arr.get(i).size(); j++) {
                    System.out.print(arr.get(i).get(j) + " ");
                }
                System.out.println();
            }

        }
    }
    public List<List<Integer>> generate(int n){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            ans.add(new ArrayList<>());
            for(int j =0;j<=1;j++){
                if(j==0||j==1) ans.get(i).add(1); // arr[i][j]=1
                else{
                   int val = ans.get(i-1).get(j)+ans.get(i-1).get(j); //val =  arr[i][j]=1
                    ans.get(i).add(val);
                }
            }
        }
        return ans;
    }
}

// leet code118