public class Spiral_matrix {
    public static void main(String[] args) {
        int[][] spiral = {{1,2,3,4,},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        spiralPrint(spiral);
    }
    static  void  spiralPrint(int[][] spiral) {
        int startRow = 0;
        int startCol = 0;
        int endRow   = spiral.length-1;
        int endCol   = spiral[0].length-1;
        while(startRow<=endRow && startCol<=endCol) {
            //top
            for(int j = startCol;j<=endCol;j++) {
                System.out.print(spiral[startRow][j]+" ");
            }

            //right
            for(int i = startRow+1;i<=endRow;i++) {
                System.out.print(spiral[i][endCol]+" ");
            }

            //bottom
            for(int j = endCol-1;j>=startCol;j--) {
                System.out.print(spiral[endRow][j]+" ");
                if(startRow==endRow) break;
            }

            //left
            for(int i = endRow-1;i>=startRow+1;i--) {
                System.out.print(spiral[i][startCol]+" ");
                if(startCol==endCol) break;
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
}
