public class String_conversion {
    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";

        // step - 1 : find lcs of str1 and str2

        int lcs_length = longestCommonSubsequence(str1,str2);

        // step  - 2 : no. of delete operation = str1.length()-lcs.length()

        int  delete_OP = str1.length() - lcs_length;

        // step - 3 : no. of insert operation = str2.length() - lcs.length()

        int insert_OP = str2.length() - lcs_length;


        System.out.println("TOTAL OPERATION REQUIRED TO CONVERT STR1->STR2(USING DELETE & INSERTION ONLY) : "
                                 +   (delete_OP+insert_OP));
    }

    private static int longestCommonSubsequence(String n, String m) {
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
                }
                else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];

                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }
        return dp[n.length()][m.length()];
    }

}
