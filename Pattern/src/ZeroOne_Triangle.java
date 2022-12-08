public class ZeroOne_Triangle {
    public static void main(String[] args) {
        int n = 10;
        ZeroOne(n);
    }
    static void ZeroOne(int n) {
        for(int i = 1;i<=n;i++) {
            for(int j = 1;j<=i;j++) {
                if(((j+i)%2)==0) System.out.print(" 1 ");
                else System.out.print(" 0 ");
            }
            System.out.println();
        }
    }
}
