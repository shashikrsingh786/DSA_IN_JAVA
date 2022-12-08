import java.util.HashMap;

public class Two_sum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        HashMap<Integer,Integer> map =  new HashMap<>();

        for(int i = 0;i<arr.length;i++) {
            int difference = target - arr[i];
            if(map.containsKey(difference)) {
                System.out.println("Required numbers indexes are : " +i+","+map.get(difference));
            }
            map.put(arr[i],i);
        }
    }
}
