

public class Test {

    static int  r1 = 1;
    static int r2 = 1;
    static int c1 = 1;
    static int c2 = 1;
    public static void main(String[] args) {
        String[][] arr = new String[2][2];
        for(int i = 0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                arr[i][j] = "#";
            }
       }
       solve(arr,0);
    }
    public static void solve(String[][] arr, int row) {
        if(row==arr.length) {
            for(int i = 0;i<arr.length;i++) {
                for(int j=0;j<arr[0].length;j++) {
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
        }
    }

        for(int i = 0; i<arr.length;i++) {
        if(isSafe()) {
            arr[row][i] = "*";
            solve(arr,row+1);
        }
    }
        }

    public static boolean isSafe() {
        if(c1>=1 && r1>=1) {
            c1--;
            r1--;
            return true;
    }
    if(r1>=1 && c2>=1) {
        r1--;
        c2--;
        return true;
    }
    if(r2>=1 && c1>=1) {
        r2--;
        c1--;
        return true;
    }
    if(r2>=1 && c2>=1) {
        r2--;
        c2--;
        return true;
    }
    return false;
 }
}
   