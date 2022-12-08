public class Friend_pair {
    public static void main(String[] args) {
        int n = 5;
        System.out.println( friendPair(n));
    }

    private static int  friendPair(int n) {
        if(n==1 || n==2)  return n;
        //choice
        //single
        int fnm1 = friendPair(n-1);
        //pair
        int fnm2 = friendPair(n-2);
        int pairWays = fnm2 * (n-1);
        int totalWays =  pairWays + fnm1;
        return totalWays;
    }
}
