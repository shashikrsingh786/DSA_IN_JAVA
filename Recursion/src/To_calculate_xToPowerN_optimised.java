public class To_calculate_xToPowerN_optimised {
    public static void main(String[] args) {
        int x = 3;
        int n = 4;
        System.out.println(calculateXton(x,n));
    }
    public static int calculateXton(int x, int y) {
        if(y==0) return 1;
        int xHalf = calculateXton(x,y/2);
        int xHalfsq = xHalf*xHalf;
        //y is odd
        if(y%2!=0) xHalfsq = x * xHalfsq;
        return xHalfsq;
    }
}
