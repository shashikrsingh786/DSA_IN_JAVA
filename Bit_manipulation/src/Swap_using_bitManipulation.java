public class Swap_using_bitManipulation {
    public static void main(String[] args) {
        int a = 3, b = 4;
        swap(a,b);
    }
    static void swap(int a , int b) {
        System.out.println("Before swapping : "+ a+","+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swapping : "+ a+","+b);
    }
}
