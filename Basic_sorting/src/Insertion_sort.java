public class Insertion_sort {
    public static void main(String[] args) {
        int[] n = {3,6,2,1,8,7,4,5,3,1};
        insertionsort(n);
        print(n);
    }

    static void insertionsort(int[] n) {
        for (int i = 1; i < n.length; i++) {
            int curr = n[i];
            int prev = i - 1;
            while (prev >= 0 && curr < n[prev]) {
                n[prev+1] = n[prev];
                prev--;
            }
            n[prev + 1] = curr;
        }
    }

    static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
