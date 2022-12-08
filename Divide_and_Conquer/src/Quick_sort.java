import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        int[]  n= {6,3,9,5,2,8};
        quickSort(n,0,n.length-1);
        System.out.println(Arrays.toString(n));
    }
    public static  void quickSort(int[] n, int si, int ei) {
        if(si>=ei) {
            return;
        }
        int pivotIndex = partition(n,si,ei);
        quickSort(n,si,pivotIndex-1);  //left part
        quickSort(n,pivotIndex+1,ei);   //right part
    }
    public static int partition(int[] n,int si, int ei) {
        int pivot = n[ei];
        int i = si-1;  //to make space for element smaller than pivot
        for(int k = si;k<ei;k++) {
            if(n[k]<=pivot) {
                i++;
                //swap
                int temp = n[k];
                n[k] = n[i];
                n[i] = temp;
            }

        }
        i++;
        int temp = pivot;
        n[ei] = n[i];   //not pivot = n[i]
        n[i] = temp;
        return i;
    }
}
