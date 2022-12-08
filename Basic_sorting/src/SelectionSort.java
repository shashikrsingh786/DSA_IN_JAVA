public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        selectionsort(arr);
        print(arr);
    }

    static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    static void selectionsort(int[] arr) {
        for(int i = 0; i<arr.length-1;i++) {
            int minval = i;
            for(int j = i+1;j<arr.length;j++) {
                if(arr[minval]>arr[j]) minval = j;
            }
            int temp = arr[minval];
             arr[minval] = arr[i];
                 arr[i]  = temp;
        }
    }
}
