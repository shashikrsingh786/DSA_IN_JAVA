public class Convert_no_to_string {

    static String[] digits = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void main(String[] args) {
        int n = 1947;
        convertToString(n);
    }
    public static void convertToString(int n) {
        if(n==0) return;
        int lastDigit = n%10;
       convertToString(n/10);
        System.out.println(digits[lastDigit]+" ");
    }
}
