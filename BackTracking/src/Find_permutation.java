public class Find_permutation {
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str,"");
    }

    private static void findPermutation(String str, String ans) {
        if(str.length()==0) {
            System.out.println(ans);
            return;
        }
        for(int i = 0;i<str.length();i++) {
            char ch = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            findPermutation(newStr,ch+ans);
        }
    }
}
