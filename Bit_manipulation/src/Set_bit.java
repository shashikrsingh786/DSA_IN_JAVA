public class Set_bit {
    public static void main(String[] args) {
        SetBit(10,2);
    }
    static void  SetBit(int n, int i) {
        int bitMask = 1<<i;
        System.out.println(n|bitMask);
    }
}
