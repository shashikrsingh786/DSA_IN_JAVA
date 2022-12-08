public class String_palindrome {
    public static void main(String[] args) {
        String str = "shashi";
        System.out.println(checkPalindrome(str));
    }
    static boolean checkPalindrome(String str) {
        int n = str.length();
        for(int i = 0;i<n/2;i++) {
            if(str.charAt(i)!=str.charAt(n-1-i))  return false;
        }
        return  true;
    }
}
