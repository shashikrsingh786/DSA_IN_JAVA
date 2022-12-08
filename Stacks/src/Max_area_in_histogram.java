import java.util.Stack;

public class Max_area_in_histogram {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] arr) {
        int maxArea = 0;
        int[] nextSmallRight = new int[arr.length];
        int[] nextSmallLeft = new int[arr.length];
        // next small right
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1;i>=0;i--) {
            int curr = arr[i];
            while(!s.isEmpty() &&  arr[s.peek()]>=curr ) {
                s.pop();
            }
            if(s.isEmpty()) nextSmallRight[i] = arr.length;
            else {
                nextSmallRight[i] = s.peek();
            }
            s.push(i);
        }
        // next small left
         s = new Stack<>();
        for(int i = 0;i<arr.length;i++) {
            int curr = arr[i];
            while(!s.isEmpty() &&  arr[s.peek()]>=curr ) {
                s.pop();
            }
            if(s.isEmpty()) nextSmallLeft[i] = -1;
            else {
                nextSmallLeft[i] = s.peek();
            }
            s.push(i);
        }
        // max area
        for(int i = 0;i<arr.length;i++) {
              int height = arr[i];
              int width = nextSmallRight[i]-nextSmallLeft[i]-1;
              int currArea = height*width;
              maxArea = Math.max(currArea,maxArea);
        }
        return maxArea;
    }
}
