public class Repeating_value {
    public static void main(String[] args) {
        int[] n = {1,2,3,1};
        System.out.println(repeating(n));
    }
    static boolean repeating(int[] n) {
        for(int i = 0;i<n.length-1;i++) {
            for(int j = i+1;j<n.length;j++) {
                if(n[i]==n[j]) return true;
            }
        }
        return false;
    }
}

// this approach is 0(n^2) , better approach is 0(n) using hashsets.
