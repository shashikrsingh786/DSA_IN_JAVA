public class Binary_to_decimal {
    public static void main(String[] args) {
        int n = 111;
        System.out.println(binToDec(n));
    }

    private static int binToDec(int n) {
        int rem,dec=0,pow = 0;
        while(n>0) {
             rem = n%10;
             dec += Math.pow(2,pow)*rem;
             pow++;
             n/=10;
        }
       return  dec;
    }
}
