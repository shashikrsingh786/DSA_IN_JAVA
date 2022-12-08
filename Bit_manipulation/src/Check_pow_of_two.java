public class Check_pow_of_two {
    public static void main(String[] args) {
        System.out.println(checkPow0fTwo(64));
    }
    static boolean checkPow0fTwo(int n) {
        return (n & n - 1) == 0;
    }
}
