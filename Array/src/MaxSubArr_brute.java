public class MaxSubArr_brute {
    public static void main(String[] args) {
        int[] n = {1,-1,3,6,-2,3};
        max(n);
    }
    static void max(int[] n) {
        //prefix
        int[] prefix = new int[n.length];
        prefix[0] = n[0];
        for(int i =1 ;i<n.length;i++) {
            prefix[i] = prefix[i-1] + n[i];
         }

        int curSum,maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<n.length;i++) {
           int   start  = i;
           for(int j = i;j<n.length;j++) {
               int end = j;
               curSum = start==0?prefix[end] :prefix[end]-prefix[start-1];
               if(maxSum<curSum) {
                   maxSum = curSum;
               }
           }
        }
        System.out.println("Max Sum is :" + maxSum);
    }
}
