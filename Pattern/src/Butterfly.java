public class Butterfly {
    public static void main(String[] args) {
        int n = 3;
        butterfly_FirstHalf(n);
        butterfly_SecondHalf(n);
    }
    static void butterfly_FirstHalf(int n) {
        for(int i =1;i<=n;i++) {
            for(int j = 1;j<=i;j++) {
                System.out.print(" * ");
            }
            for(int k = 1;k<=(2*(n-i));k++) {
                System.out.print("   ");
            }
            for(int j = 1;j<=i;j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static  void butterfly_SecondHalf(int n) {
        for(int i =n;i>=1;i--) {
            for(int j = 1;j<=i;j++) {
                System.out.print(" * ");
            }
            for(int k = 1;k<=(2*(n-i));k++) {
                System.out.print("   ");
            }
            for(int j = 1;j<=i;j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

