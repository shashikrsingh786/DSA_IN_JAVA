import java.util.Arrays;

public class Heap_Sort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void heapSort(int[] arr) {
        int n = arr.length;
        // step -1 build a max heap
        for(int i = n/2;i>=0;i--) {
            heapify(arr,i,n);
        }
        // step -2 push largest to end
        for(int i = n-1;i>=0;i--) {
            // swap(largest with first element)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }
    }
    public static void heapify(int[] arr, int idx, int size) {
        int left = 2*idx+1;
        int right = 2*idx+2;
        int maxidx = idx;

        if(left<size && arr[left]>arr[maxidx]) {
            maxidx = left;
        }
        if(right<size && arr[right]>arr[maxidx]) {
            maxidx = right;
        }
        if(maxidx!=idx) {
            // swap
            int temp = arr[idx];
            arr[idx] = arr[maxidx];
            arr[maxidx] = temp;

            heapify(arr,maxidx,size);
        }
    }
}

