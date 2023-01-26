public class Climbing_stairs_recursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(ways(n));
    }
    public static int ways(int n) {
        if(n==1 || n==2) return n;
        return ways(n-1) + ways(n-2);
    }
}
