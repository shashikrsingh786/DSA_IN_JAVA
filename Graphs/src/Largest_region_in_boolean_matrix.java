public class Largest_region_in_boolean_matrix {
    static int count;

    public static void main(String[] args) {
        int[][] arr = {{0, 0, 1, 1, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 1}};
        System.out.println(largestRegion(arr));
    }

    private static int largestRegion(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        boolean[][] vis = new boolean[n][m];
        int result = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1 && !vis[i][j]) {
                    count = 1;
                    // dfs
                    dfs(arr, i, j, vis);
                    result = Math.max(result,count);
                }
            }
        }
        return result;
    }

    public static void dfs(int[][] arr, int row, int col, boolean[][] vis) {
        int[] rowNbr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] colNbr = {-1, 0, 1, -1, 1, -1, 0, 1};
        vis[row][col] = true;
        for (int k = 0; k < 8; k++) {
            if (isSafe(arr, row + rowNbr[k], col + colNbr[k],
                    vis)) {
                count++;
                dfs(arr, row + rowNbr[k], col + colNbr[k],
                        vis);
            }
        }

    }
    public static boolean isSafe(int[][] arr, int row, int col, boolean[][] vis) {
        return ((row >= 0) && (row < arr.length) && (col >= 0)
                && (col < arr[0].length)
                && (arr[row][col] == 1 && !vis[row][col]));

    }
}
