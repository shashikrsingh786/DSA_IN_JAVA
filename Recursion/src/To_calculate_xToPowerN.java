public class To_calculate_xToPowerN {
    public static void main(String[] args) {
        int x = 3;
        int n = 4;
        System.out.println(calculateXtoN(x,n));
    }
    public static int calculateXtoN(int x, int n) {
        if(n==0) return 1;
        int xnm1 = calculateXtoN(x,n-1);
        return x*xnm1;
    }
}
