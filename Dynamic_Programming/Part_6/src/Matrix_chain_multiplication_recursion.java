public class Matrix_chain_multiplication_recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};

        System.out.println(matrixChain(arr,1,arr.length-1));
    }
    public static int matrixChain(int[] arr,int i, int j) {
         if(i==j) return 0;
        int ans = Integer.MAX_VALUE;

           for(int k = i;k<=j-1;k++) {
              int cost1 = matrixChain(arr,i,k);
              int cost2 = matrixChain(arr,k+1,j);
              // multiplying(operation) cost1 * cost2
              int cost3 = arr[i-1] * arr[k] * arr[j];

              int finalCost = cost1 + cost2 + cost3;

              ans = Math.min(ans,finalCost);
       }
           return ans;
    }
}
