import java.util.ArrayList;

class Solution{
    public ArrayList<ArrayList<Integer>> subsets(int arr[]){
        int n = arr.length;
        int m = (1<<n); // 2 raised to power n
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
                for(int i=0;i<m;i++){        // m number of subsets hinge yaha per
                    ArrayList<Integer> a = new ArrayList<>();
                    for(int j=0;j<n;j++){
                        if((i>>j)%2 ==1) a.add(arr[j]);
                    }
                    ans.add(a);
                }
                return ans;
    }
}


public class Subsets {
    static void main(String[] args) {

    }
}
