public class Catalan_number_memoisation {
    public static void main(String[] args) {
        int c = 3;

        int[] catNo = new int[c+1];
        System.out.println(findCatalanNumber(c,catNo));
    }
    public static int findCatalanNumber(int c, int[] catNo) {
        if(c==0 || c==1) return 1;
        if(catNo[c]!=0) {
            return catNo[c];
        }


        for(int i = 0;i<c;i++) {
            catNo[c] +=findCatalanNumber(i,catNo)*findCatalanNumber(c-1-i,catNo);
        }
        return catNo[c];
    }
}
