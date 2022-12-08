public class Check_if_arraySorted {
    public static void main(String[] args) {
        int[]  n = {1,4,6,8,9};
        System.out.println(isSorted(n,0));
    }

    private static boolean isSorted(int[] n, int i) {
        if(i==n.length-1)   return true;
        if(n[i]>n[i+1]) {
            return false;
        }
       return isSorted(n,i+1);
    }

}
