public class Kth_largest_odd_number_in_range {
    public static void main(String[] args) {
        int l = -8, r = 13;
        int k = 4;
        System.out.println(kthLargest(l, r, k));
    }
    public static int kthLargest(int l, int r, int k) {
        if(k==0) return 0;                      // k ==0
        int count;
        if( (r&1) >0) {
            count = (int)Math.ceil(l-r+1)/2;
            if(k>count) return -1;               // k> count
            else  return (r-2*k-2);
        }
        else {
            count = (int)Math.ceil(l-r)/2;
            if(k>count)  return -1;            // k<count
            else return (r-2*k+1);
        }
    }
}

