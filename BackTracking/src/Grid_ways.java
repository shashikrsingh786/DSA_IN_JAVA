public class Grid_ways {
    public static void main(String[] args) {
        System.out.println(gridWays(0,0,3,3));

    }

    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if(i==n-1 && j==m-1) {    // condition for last cell
            return 1;

        } else if (i==n || j==m) {        // boundary cross condition
            return 0;
        }
        //right
        int right =   gridWays(i,j+1,n,m);
        //down
        int down = gridWays(i+1,j,n,m);
        return (right + down);
    }
}
// optimised way
// [(n-1)+(m-1)]/(n-1)!(m-1)!]