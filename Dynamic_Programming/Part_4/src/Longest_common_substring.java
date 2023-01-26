public class Longest_common_substring {
    public static void main(String[] args) {
        String n = "ABCDGH";
        String m = "ACDGHR";

        int ans = 0;

        int[][] dp = new int[n.length()+1][m.length()+1];

        for(int i = 0;i<n.length()+1;i++) {
            for(int j = 0;j<m.length()+1;j++) {
                if(i==0 || j==0) {
                    dp[i][j] = 0;
                }
                else {
                    dp[i][j] = -1;
                }
            }
        }

        for(int i = 1;i<n.length()+1;i++) {
            for(int j = 1;j<m.length()+1;j++) {
                if(n.charAt(i-1)==m.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                    ans = Math.max(dp[i][j],ans);
                }
                else {
                   dp[i][j] = 0;
                }

            }
        }
        System.out.println(ans);
    }
}
