public class Pair_sum {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5,6};
        int target = 13;
        System.out.println(pairSum(arr,target));
    }

    private static boolean pairSum(int[] arr, int target) {
        // we can solve this brute force as well -> (n^2)
        // here we are using two pointer approach
        int lp = 0, rp = arr.length-1;
        while(lp<rp) {
            if(arr[lp]+arr[rp]==target) {
                return true;
            }
            else if( arr[lp]+arr[rp]<target) lp++;
            else rp--;
        }
        return false;
    }
}
