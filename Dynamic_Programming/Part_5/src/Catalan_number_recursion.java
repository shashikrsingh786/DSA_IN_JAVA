public class Catalan_number_recursion {
    public static void main(String[] args) {
        int c = 30;
        System.out.println(findCatalanNumber(c));
    }
    public static int findCatalanNumber(int c) {
        if(c==0 || c==1) return 1;

        int ans = 0;
        for(int i = 0;i<c;i++) {
             ans +=findCatalanNumber(i)*findCatalanNumber(c-1-i);
        }
        return ans;
    }
}
