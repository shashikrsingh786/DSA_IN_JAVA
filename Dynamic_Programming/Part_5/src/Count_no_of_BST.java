public class Count_no_of_BST {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(catalan(n));   // basically this question is variation of catalan
    }

    private static int catalan(int n) {
        int[] ctNo = new int[n+1];
        ctNo[0] = 1;
        ctNo[1] = 1;


        for(int i = 2;i<=n;i++) {
            for(int j = 0;j<i;j++) {
                ctNo[i] += ctNo[j]*ctNo[i-1-j];
            }
        }
        return ctNo[n];
    }

}
