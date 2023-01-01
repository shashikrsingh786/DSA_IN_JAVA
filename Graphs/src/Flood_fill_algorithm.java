

public class Flood_fill_algorithm {
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        printArr(image);
        int sr = 1;
        int sc = 1;
        int col = 2;
        floodFill(image, sr, sc, col);
        System.out.println();
        System.out.println();
        printArr(image);
    }
    public static void printArr(int[][] image) {
        for(int i = 0;i<image.length;i++) {
            for(int j = 0;j<image[0].length;j++) {
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void floodFill(int[][] image, int sr, int sc, int col) {
        boolean[][] vis = new boolean[image.length][image[0].length];
        helper(image,sr,sc,col,vis,image[sr][sc]);
    }
    public static void helper(int[][] image, int sr, int sc, int col,boolean[][] vis, int orgCol) {
        if(sr<0 || sr>= image.length || sc<0 || sc>=image[0].length ||  vis[sr][sc] || image[sr][sc]!=orgCol) {
            return;
        }
        vis[sr][sc] = true;
        image[sr][sc] = col;

        // left
        helper(image,sr,sc-1,col,vis,orgCol);
        // right
        helper(image,sr,sc+1,col,vis,orgCol);
        //up
        helper(image,sr-1,sc,col,vis,orgCol);
        //down
        helper(image,sr+1,sc,col,vis,orgCol);
    }

}
