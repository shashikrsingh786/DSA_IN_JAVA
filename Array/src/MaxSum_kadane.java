public class MaxSum_kadane {
    public static void main(String[] args) {
        int[] n = {1,-1,3,6,-2,3};
        kadane(n);
    }
    static  void kadane(int[] n) {
        int curSum=0,maxSum=Integer.MIN_VALUE;
        for (int j : n) {
            curSum += j;
            if (curSum < 0) curSum = 0;
            maxSum = Math.max(curSum, maxSum);
            }
        System.out.println("Max sub array sum is: " + maxSum);
    }
}
