public class Print_one_to_n {
    public static void main(String[] args) {
        int n = 8;
        oneToN(n);
    }
    public static void oneToN(int n) {
        if(n>=1) {
            oneToN(n - 1);
            System.out.print(n + " ");
        }
    }
}
