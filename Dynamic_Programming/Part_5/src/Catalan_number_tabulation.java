public class Catalan_number_tabulation {
    public static void main(String[] args) {
        int n = 15;

        int[] ctNo = new int[n+1];
        ctNo[0] = 1;
        ctNo[1] = 1;


        for(int i = 2;i<=n;i++) {
            for(int j = 0;j<i;j++) {
                ctNo[i] += ctNo[j]*ctNo[i-1-j];
            }
        }
        System.out.println(ctNo[n]);
    }
}
