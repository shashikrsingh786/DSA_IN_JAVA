import java.util.Arrays;
import java.util.HashSet;

public class Longest_increasing_subsequence {
    public static void main(String[] args) {
        int[] arr = {50,3,10,7,40,80};

        HashSet<Integer> hs = new HashSet<>();

        for (int j : arr) {
            hs.add(j);
        }
        int[] arr2 = new int[hs.size()];

        int l = 0;
        for(int i : hs ) {
            arr2[l] = i;
            l++;
        }

        Arrays.sort(arr2);



        int[][] dp = new int[arr.length+1][arr2.length+1];

        for(int i = 1;i<arr.length+1;i++) {
            for(int j = 1;j<arr2.length+1;j++) {
                if(arr[i-1]==arr2[j-1]) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];

                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }

        System.out.println(dp[arr.length][arr2.length]);


    }
}
