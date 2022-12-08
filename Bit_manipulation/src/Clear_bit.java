public class Clear_bit {
    public static void main(String[] args) {
        Clearbit(10, 1);
    }
    static void Clearbit(int n,int i) {
        int bitMask = ~(1<<i);
        System.out.println(n&bitMask);
    }
}
