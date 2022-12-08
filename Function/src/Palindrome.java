public class Palindrome {
    public static void main(String[] args) {
        int n = 1227821;
        System.out.println(IsPalindrome(n));
    }
    static boolean IsPalindrome(int n ) {
        return reversed(n)==n;

    }

    static  int reversed(int n) {
        int revNumber=0;
        while(n>0) {
            int LastDigit = n%10;
            revNumber = (revNumber*10) + LastDigit;
            n/=10;
        }
        return revNumber;
    }
}
