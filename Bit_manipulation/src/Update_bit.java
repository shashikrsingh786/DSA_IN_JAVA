public class Update_bit {
    public static void main(String[] args) {
        updateBit(10,2,1);
    }
    static  void updateBit(int n, int i, int update) {
        n = (n&(~(1<<i)));
        int bitMask = update<<i;
        System.out.println(n|bitMask);

    }
}

//here we first clearbit no matter what we update , then we create a bitmask = update<<i .
//and we do n|bitmask
