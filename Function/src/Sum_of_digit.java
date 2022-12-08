public class Sum_of_digit {
    public static void main(String[] args) {
        int n = 43586788;
        System.out.println(SumDigit(n));
    }
    static int SumDigit(int n ) {
        int sum=0;
        while(n>0) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
