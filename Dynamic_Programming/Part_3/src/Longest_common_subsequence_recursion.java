public class Longest_common_subsequence_recursion {
    public static void main(String[] args) {
        String n = "abcde";
        String m = "ace";

        System.out.println(longestCSubsequence(n,m,n.length(),m.length()));
    }

    private static int longestCSubsequence(String n, String m,int x,int y) {
        if(x==0 || y==0) {
            return 0;
        }

        if(n.charAt(x-1)==m.charAt(y-1)) {
            return 1 + longestCSubsequence(n,m,x-1,y-1);
        }
        if(n.charAt(x-1)!=m.charAt(y-1)) {
           int ans1 =  longestCSubsequence(n,m,x-1,y);
           int ans2 = longestCSubsequence(n,m,x,y-1);
           return Math.max(ans1,ans2);
        }
        return -1;
    }

}
