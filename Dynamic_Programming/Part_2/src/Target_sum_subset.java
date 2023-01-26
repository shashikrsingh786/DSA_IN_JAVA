public class Target_sum_subset {
    public static void main(String[] args) {
        int[] n = {4, 2, 7, 1, 3};
        int target = 10;



        System.out.println(targetSum( n, target));
    }

    public static boolean targetSum( int[] n, int target) {


        boolean[][] store = new boolean[n.length + 1][target + 1];

        for(int i = 0;i<store.length;i++) {
          // i = item , j = target Sum
            store[i][0] = true;
        }

        for (int i = 1; i < n.length + 1; i++) {
            for (int j = 1; j < target + 1; j++) {
                int val = n[i - 1];
                if (val <= j && store[i - 1][j - val] == true) {          // include
                    store[i][j] = true;
                } else if (store[i - 1][j] == true) {           //exclude
                    store[i][j] = true;
                }
            }
        }
        for(int i = 0;i<store.length;i++) {
            for(int j = 0;j<store[0].length;j++) {
                System.out.print(store[i][j]+"    ");
            }
            System.out.println();
        }
        return store[n.length][target];
    }
}
