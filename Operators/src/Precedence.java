public class Precedence {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int c = (x*y/x);
        int d = (x*(y/x));
        System.out.println(c);   //5
        System.out.println(d);   //4
    }
}
