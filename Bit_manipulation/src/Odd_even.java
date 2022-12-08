public class Odd_even {
    public static void main(String[] args) {
   int n = 101;
   int bitmask = 1;
   if((n&bitmask)==0) {
       System.out.println(n+" is even");
   }
   else System.out.println(n+" is odd");
    }
}