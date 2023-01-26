public class _0_1_knapsack_tabulation {
    public static void main(String[] args) {
        int[] values = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int Weight = 7;

        int[][] dp = new int[values.length+1][Weight+1];

        for(int i = 1;i<values.length+1;i++) {
            for(int j = 1;j<Weight+1;j++) {
                int val = values[i-1];   // ith item val
                int wtt = wt[i-1];        // ith weight va
                if(wtt<=j) {   //valid
                    int ans1 = val + dp[i-1][j-wtt];                      //include
                    int ans2 = dp[i-1][j];                       // exclude
                    dp[i][j] = Math.max(ans1,ans2);
                }
                else {
                    dp[i][j] = dp[i-1][j];               //invalid
                }
            }
        }
        System.out.println(dp[dp.length-1][dp[0].length-1]);

        for (int[] ints : dp) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(ints[j]+"        ");
            }
            System.out.println();
        }
    }
}
