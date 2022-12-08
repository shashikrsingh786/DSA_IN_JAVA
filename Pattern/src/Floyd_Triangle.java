public class Floyd_Triangle {
    public static void main(String[] args) {
        int n = 10;
        Floyd(n);
    }
    static void Floyd(int n) {
        int a = 1;
        for(int i = 1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
