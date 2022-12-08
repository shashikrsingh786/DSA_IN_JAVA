import java.util.Arrays;

public class Minimum_absolute_diff_pairs {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {2,1,3};
        int abDiff = 0;
        // step 1 sort a nd b
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0;i<a.length;i++) {
            abDiff+=Math.abs(a[i]-b[i]);
        }
        System.out.println(abDiff);
    }
}
