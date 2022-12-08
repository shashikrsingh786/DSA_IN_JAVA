public class Alphabet {
    public static void main(String[] args) {
        int n = 10;
        alphabet(n);
    }

    private static void alphabet(int n) {
        for(int i = 0; i<n;i++) {
            for(int j = 0;j<(n-1-i);j++) {
                System.out.print(" ");
            }
            for(int k = 0;k<i+1;k++) {
                System.out.print((char)(k+65));
            }
            for(int k = i-1;k>=0;k--) {
                System.out.print((char)(k+65));
            }
            System.out.println();
        }
        for(int i = n-2; i>=0;i--) {
            for(int j = 0;j<(n-1-i);j++) {
                System.out.print(" ");
            }
            for(int k = 0;k<i+1;k++) {
                System.out.print((char)(k+65));
            }
            for(int k = i-1;k>=0;k--) {
                System.out.print((char)(k+65));
            }
            System.out.println();
        }


    }
}
