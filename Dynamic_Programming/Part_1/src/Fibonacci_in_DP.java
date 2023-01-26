public class Fibonacci_in_DP {
    public static void main(String[] args) {
        int n = 6;
        int[] f = new int[n+1];
        System.out.println(fib(n,f));  // using recursion

        // using tabulation
        int[] store = new int[n+1];
        store[0] = 0;
        store[1] = 1;

        for(int i = 2;i<store.length;i++) {
            store[i] = store[i-1] + store[i-2];
        }
        System.out.println(store[store.length-1]);

    }
    public static int fib(int n,int[] f ) {
        if(n==0 || n==1) return n;
        if(f[n]!=0) return f[n];
        f[n] = fib(n-1,f) + fib(n-2,f);
        return f[n];
    }
}
