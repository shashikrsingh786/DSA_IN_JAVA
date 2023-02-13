public class Tribonacci_Numbers {
    public static void main(String[] args) {
        int n = 10;

        int[] dp = new int[n+1];

        dp[2] = 1;
        dp[0] = dp[1] = 0;

        System.out.print(dp[0]+" "+dp[1]+" "+dp[2]+" ");

        for(int i = 3;i<dp.length-1;i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            System.out.print(dp[i] +" ");
        }
    }
}
