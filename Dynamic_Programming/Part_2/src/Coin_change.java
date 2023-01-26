public class Coin_change {
    public static void main(String[] args) {
        int[] coin = {2,5,3,6};
        int total = 10;

        int[][] dp = new int[coin.length+1][total+1];

        for(int i = 0;i<dp.length;i++) {
            dp[i][0] = 1;
        }
        for(int j = 0;j<dp[0].length;j++) {
            dp[0][j] = 0;
        }

        for(int i = 1;i<coin.length+1;i++) {
            for(int j = 1;j<total+1;j++) {
                if(coin[i-1]<=j) {   //valid
                    dp[i][j] = dp[i][j-coin[i-1]] + dp[i-1][j];
                }
                else {
                    dp[i][j] = dp[i-1][j];               //invalid
                }
            }
        }
        System.out.println(dp[dp.length-1][dp[0].length-1]);
    }
}
