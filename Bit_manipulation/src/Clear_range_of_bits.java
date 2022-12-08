public class Clear_range_of_bits {
    public static void main(String[] args) {
        clearrange(15,1,2);
    }
    static void clearrange(int n, int i, int j) {
        int a = ~((-1)<<i);
        int b = (-1)<<j+1;
        int bitmask = a|b;
        System.out.println(bitmask&n);

    }
}

//      Shraddha didi method
//    static void clearrange(int n, int i, int j) {
//        int a = (1<<i)-1;
//        int b = (-1)<<j+1;
//        int bitmask = a|b;
//        System.out.println(bitmask&n);
//
//    }
