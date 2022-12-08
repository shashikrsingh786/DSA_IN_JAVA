public class BinarySearch {
    public static void main(String[] args) {
        int[] n = {2,7,8,51,65,87};
        int key = 65;

        System.out.println(bs(n,key));
    }
    static  int bs(int[] n,int key) {
        int start = 0;
        int end = n.length-1;
        int mid;
        while(start<=end) {
             mid = (start + end) / 2;
            if (n[mid] == key) return mid;
            if (n[mid] < key) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
