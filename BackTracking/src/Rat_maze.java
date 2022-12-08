public class Rat_maze {
    public static void main(String[] args) {
        int[][]  maze =  {{ 1, 1, 0, 0 },{ 1, 1, 0, 0 },{ 1, 1, 0, 0 },{ 0, 1, 1, 1 } };
        mazeSolver(maze);
    }
    public static void printSol(int[][] sol) {
        for (int[] ints : sol) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    private static void mazeSolver(int[][] maze) {
        int n = maze.length;
        int[][] sol = new int[n][n];
        if(mazeSol(maze,0,0,sol)) {
            System.out.println("solution  exist");
            printSol(sol);
        }
        System.out.println("solution  do not exist");
    }
    public static boolean mazeSol(int[][] maze, int i , int j , int[][] sol) {
        // base case
        if(i==sol.length-1 && j==sol.length-1 && maze[i][j]==1 ) {
            sol[i][j] = 1;
            return true;
        }
        if(isSafe(maze,i,j)) {
            if(sol[i][j]==1) return false;
            sol[i][j] = 1;
            if(mazeSol(maze,i,j+1,sol)) return true;
            if(mazeSol(maze,i+1,j,sol)) return true;
            sol[i][j] = 0;
        }
        return false;
    }
    public static boolean isSafe(int[][] maze, int i, int j) {
        return (i<maze.length && j<maze.length && maze[i][j]==1);
    }
}
