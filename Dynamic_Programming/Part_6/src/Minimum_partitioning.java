public class Minimum_partitioning {
    public static void main(String[] args) {
        int[] arr = {1,6,11,5};

        int sum = 0;

        for(int i : arr) {
            sum += i;
        }


        int n = arr.length;
        int w = sum/2;



        int[][] dp = new int[n+1][w+1];

        for(int i = 1;i<n+1;i++) {
            for(int j = 1;j<w+1;j++) {
                if(arr[i-1]<=j) {
                    // include
                    int ans1 = arr[i-1] + dp[i-1][j-arr[i-1]];
                    // exclude
                    int ans2 = dp[i-1][j];
                    dp[i][j] = Math.max(ans1,ans2);
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        int sum1 = dp[n][w];

        int sum2 = sum-w;


        System.out.println(Math.abs(sum1-sum2));
    }
}
