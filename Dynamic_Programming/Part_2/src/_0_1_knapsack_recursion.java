public class _0_1_knapsack_recursion {
    public static void main(String[] args) {
        int W = 7;
        int[] value = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};

        System.out.println(knapSack(value,wt,W,wt.length));
    }

    private static int knapSack(int[] value, int[] wt, int W, int n) {
        if(W==0 || n==0) {
            return 0;
        }
        if(wt[n-1]<=W) {  // valid
            int ans1 = value[n-1]+ knapSack(value,wt,W-wt[n-1],n-1);   // include
            int ans2 = knapSack(value,wt,W-wt[n-1],n-1);

            return Math.max(ans1,ans2);

        }
        else {
            return knapSack(value,wt,W,n-1);
        }
    }

}
