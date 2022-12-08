public class Pawns {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                board[i][j] = 'x';
            }
        }
        if(nPawns(board,0)) {
            System.out.println("solution is possible");
            printBoard(board);
        }
        System.out.println("Solution is not possible");
    }
    public static boolean nPawns(char[][] board, int row) {
        if(row==board.length) {
            return true;
        }
        for(int j = 0;j<board.length;j++) {
            if(isSafe(board,row,j)) {
                board[row][j] = 'P';
                if(nPawns(board,row+1)) {
                    return true;
                }
                board[row][j] = 'x';
            }
        }
        return false;
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
    public static boolean isSafe(char[][] board, int row, int col) {
        // vertical
        for(int i = row;i>=0;i--) {
            if(board[i][col]=='P') {
                return false;
            }
        }
        return true;
    }
}
