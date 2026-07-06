public class ScoreafterFlippingmatrix {
    class Solution {
        public int matrixScore(int[][] arr) {
            // 0th col of matrix should have all ones
            // har us col ko flip karo jisme no of 0 > no of 1
        int m = arr.length, n = arr[0].length;
        for(int i = 0; i<m;i++){
            if(arr[i][0]==0){    // flip that row
                for(int j=0; j<n;j++){
//                    arr[i][j] ^=1;
                    arr[i][j] =1 -arr[i][j];
                }
            }
        }
            // har us col ko flip karo jisme no of 0 > no of 1
            for(int j = 0; j<m;j++) {
                int zeroes = 0 , ones =0;
                for (int i = 0; i < n; i++) {
                    if(arr[i][j]==0) zeroes++;
                    else ones++;
                }
                if(zeroes>ones){ // flip that column
                    for(int i=0;i<m;i++){
//                        if(arr[i][j]==0) zeroes++;
//                        else  ones++;
                        arr[i][j] ^=1;
                    }
                }
            }

            int sum =0;
              int pow =1;

            for(int j = n-1; j>=0;j--) {
                int ones =0;
                for (int i = 0; i < n; i++) {
                    if(arr[i][j]==0) ones++;
                }
              sum+= pow*ones;
                pow*=2;
            }
            return sum;
        }
    }
}
