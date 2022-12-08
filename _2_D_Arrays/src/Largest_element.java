public class Largest_element {
    public static void main(String[] args) {
        int[][] n = {{1,2,3,},{4,5,6,},{7,8,9}};
        System.out.println(largest(n));
    }
    static int largest(int[][] arr) {
        int largest = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                largest = Math.max(largest, ints[j]);
            }
        }
        return  largest;
    }
}
