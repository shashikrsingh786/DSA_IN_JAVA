public class Sum_of_n_natural {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(sumOfN(n));
    }
    public static int sumOfN(int n)  {
        if(n==1) return 1;
        int snm1 = sumOfN(n-1);
        return n+snm1;
    }
}
