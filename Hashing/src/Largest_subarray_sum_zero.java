import java.util.HashMap;

public class Largest_subarray_sum_zero {
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer> hm = new HashMap<>();

        int sum = 0;
        int length = 0;

        for(int i =0;i<arr.length;i++) {
            sum+=arr[i];
            if(hm.containsKey(sum)) {
                length = Math.max(length,(i-hm.get(sum)));
            }
            else {
                hm.put(sum, i);
            }

        }

        System.out.println("max length sub array is: " + length);



    }
}
