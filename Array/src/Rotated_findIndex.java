import java.util.Scanner;

public class Rotated_findIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = {1};
        int target = sc.nextInt();
       int min =  minSearch(n);
       if(target>n[n.length-1]) {
           System.out.println(search(n,target,0,min-1));
       }
       else System.out.println(search(n,target,min,n.length-1));
    }
    public static  int minSearch(int[] nums) {    // can also use if(arr[i+1]<arr[i]) return i;
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(mid >  0  &&   nums[mid-1]    >  nums[mid]){ return mid; }
            else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){ left = mid+1; }
            else{ right = mid-1; }
        }
        return left;
    }
    public  static int search(int[] arr, int target, int start, int end) {
        int mid;
        while(start<=end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
