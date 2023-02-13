public class Min_arr_jumps {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};

        int[] dp = new int[arr.length];

        dp[arr.length-1] = 0;

        for(int i = arr.length-2;i>=0;i--) {
            int ans;
            int steps = arr[i];
            dp[i] = Integer.MAX_VALUE;
            for(int j = i+1; j<=steps+i && j<arr.length; j++) {
                ans = dp[j] + 1;
                dp[i] = Math.min(dp[i],ans);
            }
            System.out.print("min jumps from position " + i + " is: "  + dp[i]);
            System.out.println();
        }
        System.out.println(dp[0]);
    }
}
