public class Transpose_of_matrix {
    public static void main(String[] args) {
        int[][] n =   { {1,4},{11,4},{2,2} };
        transpose(n);
    }
    static void transpose(int[][] n) {
        for(int j = 0;j<n[0].length;j++) {
            for( int i = 0; i<n.length;i++) {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
}
