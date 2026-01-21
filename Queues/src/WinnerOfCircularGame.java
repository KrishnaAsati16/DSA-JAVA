import java.util.LinkedList;
import java.util.Queue;

public class WinnerOfCircularGame {
    static void main(String[] args) {
        int n = 5; // total players
        int k = 2; // step count

        WinnerOfCircularGame obj = new WinnerOfCircularGame();

        int winner = obj.findTheWinner(n, k);

        System.out.println("Winner is: " + winner);
    }

    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        while(q.size()>1){
            // k-1 elements remove and add
            for(int i=1;i<=k-1;i++){
                q.add(q.remove());
            }
            q.remove(); // kth will be removed
        }
        return q.peek();
    }
}
//leet code 1823
