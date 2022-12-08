public class Maximum_balanced_string_partition {
    public static void main(String[] args) {
        String str = "LLRRRLLRRL";
        System.out.println(maxPartition(str));
    }
    public static int maxPartition(String str) {
        int len = str.length();
        int l = 0,r =0;
        int ans = 0;


        for(int i = 0;i<len;i++) {
            char c = str.charAt(i);
            if(c=='L') l++;
            else r++;
            if(l==r) ans++;
        }
        return  ans;
    }
}
