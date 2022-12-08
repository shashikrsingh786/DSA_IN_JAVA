public class Knight_moves {
    static int  N = 8;
    public static void main(String[] args) {
        solveKT();
    }
    public static boolean solveKT() {
        int[][] sol =new int[N][N];
        for(int x=0;x<N;x++)
            for(int y=0;y<N;y++)
                sol[x][y] = -1;
        int[] xMove = {2,1, -1, -2, -2, -1,1,2};
        int[] yMove = {1,2,2,1, -1, -2, -2, -1};
        //As the Knight starts from cell(0,0)
        sol[0][0] = 0;
        if(!solveKTUtil(0,0,1,sol,xMove,yMove)) {
            System.out.println("Solution does not exist");
            return false;
        }
        else printSolution(sol);
        return true;
    }
    public static void printSolution(int[][] sol) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                System.out.print(sol[x][y] + "       ");
            }
                System.out.println();

        }
    }
    public static boolean solveKTUtil(int x, int y, int moveI, int[][] sol, int[] xMove, int[] yMove) {
        int nextX, nextY;
        if(moveI==N*N) {
            return true;
        }
        for(int i = 0;i<N;i++) {
            nextX = x + xMove[i];
            nextY = y + yMove[i];
            if(isSafe(nextX,nextY,sol)) {
                sol[nextX][nextY] =moveI;
                if(solveKTUtil(nextX,nextY,moveI+1,sol,xMove,yMove))
                    return true;
                else sol[nextX][nextY]= -1;  // backtracking
                 }
        }
        return false;
        }
    public static boolean isSafe(int x, int y, int[][] sol) {
        return (x>=0 && x<N && y>=0 && y<N && sol[x][y] == -1);
    }
    }
