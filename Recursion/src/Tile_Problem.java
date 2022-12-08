public class Tile_Problem {
    public static void main(String[] args) {
        System.out.println(tile(4));  // 2 X n = 4
    }

    private static int tile(int i) {
        if(i==0 || i==1) {
            return  1;
        }
        //vertical
        int fnm1 = tile(i-1);
        //horizontal
        int fnm2 = tile(i-2);

        int totWays = fnm2 + fnm1;

        return  totWays;
    }

}
