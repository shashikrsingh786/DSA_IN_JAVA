public class Search_in_sorted_array {
    public static void main(String[] args) {
        int[][] n = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key =390;
        search(n,key);
    }
    static void search(int[][] n,int key) {
        int row=0,col=n[0].length-1;
        boolean result = false;
        while(row<n.length && col>=0) {
            int value = n[row][col];
            if (key == value) {
                result = true;
                break;
            } else if (key > value) {
                row++;
            } else {
                col--;
            }
        }
        System.out.println(result ?("key found at:"+"("+row+","+col+")"):"key not found lol");
    }
}
