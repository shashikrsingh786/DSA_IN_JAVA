public class Majority_ocurring_element {
    public static void main(String[] args) {
        int[] n ={3,2,3};
        System.out.println(majority(n));
    }
    public static int majority(int[] n) {
       return majorityrec(n, 0, n.length-1);
    }

    public static  int majorityrec(int[] n, int lo, int hi) {
        if(lo==hi) {           //BASE CASE
            return n[lo];
        }
        // recurse on left and right halves of this slice
        int mid = lo+(hi-lo)/2;
        int left = majorityrec(n,lo,mid);
        int right = majorityrec(n,mid+1,hi);
        //if the two halves agree on the majority element, return it.
        if(left==right) {
            return left;
        }
        // otherwise, count each element and return the "winner".
        int leftCount = countInRange(n,left,lo,hi);
        int rightCount =countInRange(n,right,lo,hi);
        return leftCount>rightCount?left:right;}
    private static int countInRange(int[] n,int num,int lo,int hi) {
    int count=0;
    for(int i=lo;i<=hi;i++) {
        if(n[i] ==num) {
            count++;
        }
    }
    return count;
        }
        }

