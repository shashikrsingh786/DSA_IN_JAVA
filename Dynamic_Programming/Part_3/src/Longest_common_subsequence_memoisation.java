public class Longest_common_subsequence_memoisation {
    public static void main(String[] args) {
        String n = "abcde";
        String m = "ace";

        int[][] dp = new int[n.length()+1][m.length()+1];

        for(int[] i : dp) {
            for(int j = 0;j<dp[0].length;j++) {
                i[j] = -1;
            }
        }

        System.out.println(longestCSubsequence(n,m,n.length(),m.length(),dp));
    }

    private static int longestCSubsequence(String n, String m,int x,int y,int[][] dp) {
        if(x==0 || y==0) {
            return 0;
        }
        if(dp[x][y]!=-1)  {
            return dp[x][y];
        }

        if(n.charAt(x-1)==m.charAt(y-1)) {
            return dp[x][y] = 1 + longestCSubsequence(n,m,x-1,y-1,dp);

        }
        if(n.charAt(x-1)!=m.charAt(y-1)) {
           int ans1 =  longestCSubsequence(n,m,x-1,y,dp);
           int ans2 = longestCSubsequence(n,m,x,y-1,dp);
           return dp[x][y] = Math.max(ans1,ans2);
        }
        return -1;
    }

}
