import java.util.ArrayList;

public class Pair_sum_rotated_sorted {
    public static void main(String[] args) {
        ArrayList<Integer>  li = new ArrayList<>();
        li.add(11);
        li.add(15);
        li.add(6);
        li.add(8);
        li.add(9);
        li.add(10);
        int target = 16;
        System.out.println(pairSum(li,target));
    }

    private static boolean pairSum(ArrayList<Integer> li, int target) {
        int n = li.size();
        int min = minSearch(li);
        int lp = min;
        int rp = min-1;
        while(lp!=rp) {
            if(li.get(lp) + li.get(rp) ==target) {
                return true;
            }
            else if( li.get(lp) + li.get(rp) <target)  lp = (lp+1)%n;
            else  rp= (n+rp-1)%n;
        }
        return false;
        }

    private static int minSearch(ArrayList<Integer> li) {
        int left = 0;
        int right = li.size() - 1;
        while(left < right) {
            int mid = left + (right - left)/2;
            if(mid >  0  &&   li.get(mid - 1) > li.get(mid)){ return mid; }
            else if(li.get(left) <= li.get(mid) && li.get(mid) > li.get(right)){ left = mid+1; }
            else{ right = mid-1; }
        }
        return left;
    }
}
