public class Diagonal_sum {
    public static void main(String[] args) {
        int[][] spiral = {{1, 2, 3, 4,},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        System.out.println(diagonalSum(spiral));
    }

    static int diagonalSum(int[][] spiral) {
        int sum = 0;

      //  for (int i = 0; i < spiral.length; i++) {

          //  for (int j = 0; j < spiral[0].length; j++) {
                //for primary diagonal
           //     if (i == j) sum += spiral[i][j];
                //for secondary diagonal
          //     else if ((i + j == spiral.length - 1)) sum += spiral[i][j];
        //    }
     //   }

        for(int i =0;i< spiral.length;i++) {
            //pd
            sum+=spiral[i][i];
            //sd
            if(i!= spiral.length-1-i) sum+=spiral[i][spiral.length-1-i];
               // if(i!= spiral.length-1-i) -> to remove odd element from adding up again.
        }
        return sum;
    }
}
