import java.util.*;

public class Maximum_all_subArray {
    public static void main(String[] args) {
        int[] arr = {12, 1, 78, 90, 57, 89, 56};
        int k = 3;
        printMax(arr, arr.length, k);
    }
    public static void printMax(int[] arr, int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        for (int i = 0; i < k; i++) {
            while (!q.isEmpty() && arr[i]>arr[q.peek()]) {
                q.remove();
                q.add(i);
            }
        }
    }
}
