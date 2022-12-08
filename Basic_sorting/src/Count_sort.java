import java.util.Arrays;

public class Count_sort {
    public static void main(String[] args) {
        int[]  n = {3,6,2,1,8,7,4,5,3,1};
        countsort(n);
        print(n);
    }
    static void countsort(int[]  n) {
        int largest = Integer.MIN_VALUE;
        for (int k : n) {
            largest = Math.max(largest, k);
        }
        int[] count = new int[largest+1];
        for(int i = 0; i<n.length;i++) {
           count[n[i]]++;
        }


        int j = 0;
        for(int i =0;i<count.length;i++) {
            while(count[i]>0) {
                n[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
