public class Print_n_to_one {
    public static void main(String[] args) {
        int n = 10;
        nToOne(n);
    }

    public static void nToOne(int n) {
        if(n>0) {
            System.out.print(n+" ");
            nToOne(n - 1);
        }
    }
}
