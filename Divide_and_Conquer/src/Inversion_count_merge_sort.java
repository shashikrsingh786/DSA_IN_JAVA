public class Inversion_count_merge_sort {
    public static void main(String[] args) {
        int[] n = {1,20,6,5,4};
        System.out.println("Inversion count is: " + inversion(n));
    }
    public  static int inversion(int[] n) {
        return mergeSort(n,0,n.length-1);
    }
    public static int mergeSort(int[] n, int left, int right) {
        int ivcount = 0;
        if(left<right) {
            int mid = (left+right)/2;
            ivcount = mergeSort(n,left,mid);
            ivcount+= mergeSort(n,mid+1,right);
            ivcount+=merge(n,left,mid+1,right);
        }
        return ivcount;
    }
    public static int merge(int[] n,int left, int mid, int right) {
        int i = left, j = mid; int k = 0;
        int ivcount = 0;
        int[] temp = new int[right - left +1];
        while((i<mid) && (j<=right)) {
            if(n[i]<=n[j]) {
                temp[k] = n[i];
                k++;
                i++;
            }
            else {
                temp[k] = n[j];
                ivcount += mid-i;
                j++;
                k++;
            }
        }
        while(i<mid) temp[k++] = n[i++];
        while(j<=right) temp[k++] = n[j++];

        for(i = left,k=0; i<=right; i++,k++) {
            n[i] = temp[k];
        }
        return ivcount;
    }
}
