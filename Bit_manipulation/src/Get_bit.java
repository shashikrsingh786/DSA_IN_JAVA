public class Get_bit {
    public static void main(String[] args) {
        System.out.println(getBit(10,3));
    }
    static int getBit(int n, int i) {
        int bitMask = 1<<i;
        if((n&bitMask)==0) {
            return 0;
        }
        return  1;
    }
}

