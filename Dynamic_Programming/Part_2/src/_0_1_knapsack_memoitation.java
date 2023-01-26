import java.util.Arrays;

public class _0_1_knapsack_memoitation {
    public static void main(String[] args) {
        int W = 7;
        int[] value = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};

        int[][] dp = new int[W+1][value.length+1];
        
        for(int i = 0;i<dp.length;i++) {
            for(int j = 0;j<dp[0].length;j++) {
                dp[i][j] = -1;

            }

        }

        System.out.println(knapSack(value,wt,W,wt.length,dp));
    }

    private static int knapSack(int[] value, int[] wt, int W, int n, int [][] dp) {
        if(W==0 || n==0) {
            return 0;
        }
        if(dp[W][n]!=-1) {
            return dp[W][n];
        }
        if(wt[n-1]<=W) {  // valid
            int ans1 = value[n-1]+ knapSack(value,wt,W-wt[n-1],n-1,dp);   // include
            int ans2 = knapSack(value,wt,W-wt[n-1],n-1,dp);
            dp[W][n] = Math.max(ans1,ans2);
            return dp[W][n];

        }
        else {
            dp[W][n] = knapSack(value,wt,W,n-1,dp);
            return dp[W][n];
        }
    }

}
