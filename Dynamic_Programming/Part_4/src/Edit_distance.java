public class Edit_distance {
    public static void main(String[] args) {
        String str = "intention";
        String str2 = "execution";

        int[][] dp = new int[str.length()+1][str2.length()+1];

        for(int i = 0;i<str.length()+1;i++) {
            for(int j = 0;j<str2.length()+1;j++) {
                if(i==0) dp[i][j] = j;
                if(j==0) dp[i][j] = i;
            }
        }
        for(int i = 1;i<dp.length;i++) {
            for(int j = 1;j<dp[0].length;j++) {
                if(str.charAt(i-1)==str2.charAt(j-1)) {       // same
                    dp[i][j] = dp[i-1][j-1];
                }
                else {                                       // diff
                    int add = dp[i][j-1] +1;
                    int delete =dp[i-1][j] +1;
                    int replace = dp[i-1][j-1] + 1;

                    dp[i][j] = Math.min(add,Math.min(delete,replace));
                }
            }
        }
        System.out.println(dp[str.length()][str2.length()]);
    }
}
