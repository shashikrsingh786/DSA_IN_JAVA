public class Climbing_stair_memoisation {
    static int n = 5;
    static int[] arr = new int[n+1];
    public static void main(String[] args) {
        System.out.println(ways(n));
    }

    public static int ways(int n) {
        if(n==1 || n==2) return n;
        if(arr[n]!=0) return arr[n];
        arr[n] = ways(n-1) + ways(n-2);
        return arr[n];
    }
}
