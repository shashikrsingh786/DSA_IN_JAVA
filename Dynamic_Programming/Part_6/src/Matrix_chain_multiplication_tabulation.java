public class Matrix_chain_multiplication_tabulation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};

        int[][] dp = new int[arr.length][arr.length];

        // initialisation of dp
        for(int i = 0;i<dp.length;i++) {
            dp[i][i] = 0;
        }


        // meaning to each cell is every cell (i,j) contain min Cost of multiplication of matrix i to j


        // filling bottom up

        for(int len = 2;len<=arr.length-1;len++) {
            for(int i = 1;i<=arr.length-len;i++ ) {

                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
                   // dividing
                for(int k = i;k<=j-1;k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];

                    dp[i][j] = Math.min(dp[i][j],cost1+cost2+cost3);
                }
            }
        }
        System.out.println(dp[1][arr.length-1]);
    }
}
