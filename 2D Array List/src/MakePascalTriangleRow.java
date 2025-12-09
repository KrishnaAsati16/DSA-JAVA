import java.util.ArrayList;
import java.util.List;
//

public class MakePascalTriangleRow {
//
//
//        public class Arraylist {
//            static void main() {
//                ArrayList<Integer> a = new ArrayList<>();
//                a.add(3);
//                a.add(23);
//                a.add(93);
//
//                ArrayList<Integer> b = new ArrayList<>();
//                b.add(9993);
//                b.add(365);
//                b.add(325);
//
//                ArrayList<Integer> c = new ArrayList<>();
//                c.add(53);
//                c.add(993);
//                c.add(93);
//
//                ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
//                int  n = rowIndex+1;
//                arr.add(a);
//                arr.add(b);
//                arr.add(c);
//
//                //System.out.println(arr);
//
//                for (int i = 0; i < arr.size(); i++) {
//                    for (int j = 0; j < arr.get(i).size(); j++) {
//                        System.out.print(arr.get(i).get(j) + " ");
//                    }
//                    System.out.println();
//                }
//
//            }
//        }
//        public List<List<Integer>> generate(int n) {
//            List<List<Integer>> ans = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                ans.add(new ArrayList<>());
//                for (int j = 0; j <= 1; j++) {
//                    if (j == 0 || j == 1) ans.get(i).add(1); // arr[i][j]=1
//                    else {
//                        int val = ans.get(i - 1).get(j) + ans.get(i - 1).get(j); //val =  arr[i][j]=1
//                        ans.get(i).add(val);
//                    }
//                }
//            }
//            return ans.get(rowIndex);
//        }

//    public class MakePascalTriangleRow {
//
//        // Method to return the rowIndex-th row of Pascal's Triangle
//        public List<Integer> getRow(int rowIndex) {
//            List<Integer> row = new ArrayList<>();
//            row.add(1); // first element is always 1
//
//            for (int i = 1; i <= rowIndex; i++) {
//                row.add(0); // expand list size
//
//                // update from right to left
//                for (int j = i; j > 0; j--) {
//                    row.set(j, row.get(j) + row.get(j - 1));
//                }
//            }
//
//            return row;
//        }
//
//        // Main function to test
//        public static void main(String[] args) {
//            MakePascalTriangleRow obj = new MakePascalTriangleRow();
//            int rowIndex = 4; // example
//
//            List<Integer> result = obj.getRow(rowIndex);
//
//            System.out.println(result);
//        }
//    }

}



// LEET CODE 119