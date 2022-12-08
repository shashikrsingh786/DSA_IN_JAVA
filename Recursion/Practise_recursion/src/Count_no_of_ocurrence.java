public class Count_no_of_ocurrence {
    public static void main(String[] args) {
        int[] n = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        CountIndices(n,0,key);
    }
    public static void CountIndices(int[] n,int i, int key) {
        if(i==n.length) {
            return;
        }
        if(n[i]==key) {
            System.out.print(i+" ");
        }
        CountIndices(n,i+1,key);
    }
}
