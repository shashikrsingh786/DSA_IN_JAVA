import java.util.Arrays;

public class Create_and_decrease_array {
    public static void main(String[] args) {
        int[]  arr = new int[5];
        changeArr(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    public static void changeArr(int[] arr, int i, int val) {
        //base case
        if(i==arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[i] = val;
        changeArr(arr,i+1,val+1);         //recursion
        arr[i]-=2;             //back tracking
    }
}
