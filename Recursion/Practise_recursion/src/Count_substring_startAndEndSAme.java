public class Count_substring_startAndEndSAme {
    public static void main(String[] args) {
        String a = "aba";
        int n = a.length();
        System.out.println(count(a,0,n-1,n));
    }
    public static int count(String a, int i, int j,int n) {
        if(n==1) return 1;
        if(n<=0) return 0;
        int res = count(a,i,j-1,n-1)+
                 count(a,i+1,j,n-1) -
                count(a,i+1,j-1,n-2);
        if(a.charAt(i)==a.charAt(j)) res++;
        return res;
    }
 }
