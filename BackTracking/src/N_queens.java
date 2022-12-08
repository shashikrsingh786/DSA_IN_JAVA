public class N_queens {
    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];
        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board,0);
    }

    private static void nQueens(char[][] board, int row) {
        //base
        if(row==board.length) {
            printBoard(board);
            return;
        }
        for(int j = 0;j<board.length;j++) {
            if (isSafe(board,row,j)) {           // to check safety
                board[row][j] = 'Q';
                nQueens(board, row + 1);        //function call
                board[row][j] = 'x';       //backtracking step
            }
        }
    }

    public static boolean isSafe(char[][] board,int row, int col) {
        //diagonal left
       for(int r = row,c=col;r>=0 && c>=0;r--,c--) {
          if(board[r][c]=='Q')  return false;
       }
       //diagonal right
        for(int r = row,c = col;r>=0 && c<board.length;r--,c++) {
            if(board[r][c]=='Q') return false;
        }
        //vertical up
        for(int r = row;r>=0;r--) {
            if(board[r][col]=='Q') return false;
        }
        return true;
    }
    public static void printBoard(char[][] board) {
        System.out.println("----CHESS BOARD----");
        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(chars[j]+" ");
            }
            System.out.println();
        }
    }
}
