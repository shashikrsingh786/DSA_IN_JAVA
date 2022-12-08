import java.util.Scanner;

public class Decimal_binary {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        dectobin(n);
    }
    static void dectobin(int n) {
        int bin = 0,pow=0;
        while(n>0) {
           int rem = n%2;
           bin += rem*Math.pow(10,pow);
           pow++;
           n/=2;
        }
        System.out.println(bin);
    }
}
