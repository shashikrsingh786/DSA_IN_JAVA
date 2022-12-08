import java.util.Stack;

public class Next_greater_element {
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        int[] nextGreater = new int[arr.length];
        nextGreat(arr,nextGreater);
        for (int j : nextGreater) {
            System.out.print(j + " ");
        }
    }
    public static void nextGreat(int[] arr, int[] nextGreater) {
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1;i>=0;i--) {
            int curr = arr[i];
            // 1 -> while
            while(!s.isEmpty() && curr >= arr[s.peek()]) {
                s.pop();
            }
            // 2 -> if-else
            if(s.isEmpty()) nextGreater[i] = -1;
            else {
                nextGreater[i] = arr[s.peek()];
            }
            // 3 push element
            s.push(i);
        }
    }
}

