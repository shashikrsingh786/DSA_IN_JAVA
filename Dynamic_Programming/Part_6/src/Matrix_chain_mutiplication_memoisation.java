import java.util.Arrays;

public class Matrix_chain_mutiplication_memoisation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};

        int[][] dp = new int[arr.length][arr.length];

        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }

        System.out.println(matrixChain(arr,1,arr.length-1,dp));
    }
    public static int matrixChain(int[] arr,int i, int j,int[][] dp) {
        if(i==j) return 0;

        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;

        for(int k = i;k<=j-1;k++) {
            int cost1 = matrixChain(arr,i,k,dp);
            int cost2 = matrixChain(arr,k+1,j,dp);
            // multiplying(operation) cost1 * cost2
            int cost3 = arr[i-1] * arr[k] * arr[j];

            int finalCost = cost1 + cost2 + cost3;

            ans = Math.min(ans,finalCost);
        }
        dp[i][j] = ans;
        return dp[i][j];
    }
}
