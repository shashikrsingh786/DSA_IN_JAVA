import java.util.Arrays;

public class Merge_sort_for_strings {
    public static void main(String[] args) {
        String[] n = {"sun", "earth", "mars", "mercury"};
        mergeSort(n,0,n.length-1);
        System.out.println(Arrays.toString(n));
    }

    private static void  mergeSort(String[] n, int si, int ei) {
        if(si>=ei) {
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(n,si,mid);      //sort left part
        mergeSort(n,mid+1,ei);  //sort right part
        merge(n,si,mid,ei);          //merge sorted left and right part
    }

    private static void merge(String[] n, int si, int mid, int ei) {
        int i = si;   //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0;      //iterator for temp arr
        String[] temp = new String[ei-si+1];
        while(i<=mid && j<=ei) {
            if(compare(n[i],n[j]))  {
                temp[k] = n[i];
                i++;
            }
            else  {
                temp[k] = n[j];
                j++;
            }
            k++;
        }
        while(i<=mid) temp[k++] = n[i++];         //left element of left part
        while(j<=ei)  temp[k++] = n[j++];          //left element of right part

        for(k=0,i=si;k<temp.length;i++,k++) {          //copy element of temp into original array
            n[i] = temp[k];
        }
    }
    public static boolean compare(String s1, String s2) {
        return s1.compareTo(s2)<0;
    }
}
