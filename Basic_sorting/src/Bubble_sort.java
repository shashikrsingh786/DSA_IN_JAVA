public class Bubble_sort {
    public static void main(String[] args) {
        int[]  arr = {3,6,2,1,8,7,4,5,3,1};
        bubblesort(arr);
        print(arr);
    }
    static void bubblesort(int[] arr) {
        int swaps = 0;
        for(int turn = 0; turn<arr.length-1;turn++) {
            for(int j =0 ; j<arr.length-1-turn;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }

                    }
            if(swaps==0) {
                System.out.println("khatam tata bye bye");
                break;

            }
        }
        System.out.println(swaps);
    }
    static void print(int[]  arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
 }
