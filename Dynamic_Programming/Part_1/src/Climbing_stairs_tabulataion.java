public class Climbing_stairs_tabulataion {
    public static void main(String[] args) {
        int n = 5;
       int[] store = new int[n+1];
       store[1] = 1;
       store[2] = 2;
           for(int i = 3;i<store.length;i++) {
               store[i] = store[i-1] + store[i-2];
           }
        System.out.println(store[store.length-1]);
    }
}
