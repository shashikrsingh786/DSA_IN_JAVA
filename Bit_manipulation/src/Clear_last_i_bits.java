public class Clear_last_i_bits {
    public static void main(String[] args) {
        clearlastIbits(7,2);
    }
    static  void clearlastIbits(int n, int i) {
        int bitmask = (-1)<<i;
        System.out.println(n&bitmask);

    }
}
