import java.util.LinkedList;
import java.util.Queue;

public class Rotten_oranges {
    public static void main(String[] args) {
        int[][] arr = {  {2, 1, 0, 2, 1},
                {0, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}};
        int ans = Solution(arr);
        if(ans == -1)
            System.out.println("All oranges cannot rot");
        else
            System.out.println("Time required for all oranges to rot = " + ans);
    }
    public static int Solution(int[][] arr) {
        Queue<OrangeInfo> q = new LinkedList<>();

        int  n = arr.length;
        int m = arr[0].length;
        int[][] vis = new int[n][m];
        int cntFresh = 0;
        int minTime = 0;

        for(int i = 0;i<arr.length;i++) {
            for(int j = 0;j<arr[0].length;j++) {
                if(arr[i][j]==2)  {
                    q.add(new OrangeInfo(i,j,minTime));
                    vis[i][j] = 2; // mark as visited and rotten
                 }
                // if not rotten
                else {
                    vis[i][j] = 0;
                }
                // count fresh oranges
                if (arr[i][j] == 1) cntFresh++;
            }
        }

        // delta row and delta column
        int[] drow = {-1, 0, +1, 0};
        int[] dcol = {0, 1, 0, -1};
        int cnt = 0;
        while(!q.isEmpty()) {
            int r = q.peek().i;
            int c = q.peek().j;
            int t = q.peek().time;
            minTime = Math.max(minTime, t);
            q.remove();
            // exactly 4 neighbours
            for (int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                // check for valid coordinates and
                // then for unvisited fresh orange
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                        vis[nrow][ncol] == 0 && arr[nrow][ncol] == 1) {
                    // push in queue with timer increased
                    q.add(new OrangeInfo(nrow, ncol, t + 1));
                    // mark as rotten
                    vis[nrow][ncol] = 2;
                    cnt++;
                }
            }
        }

        // if all oranges are not rotten
        if (cnt != cntFresh) return -1;
        return minTime;
        }
    public static class OrangeInfo {
        int i;
        int j;
        int time;

        OrangeInfo(int i,int j,int time) {
            this.i = i;
            this.j = j;
            this.time = time;
        }


    }
    }

