public class Fibonacci_number {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fibonacci(n));
    }
    public static  int fibonacci(int n ) {
        if(n==0 || n==1)  return n;
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int fn = fnm2+fnm1;
       return fn;
    }
}
