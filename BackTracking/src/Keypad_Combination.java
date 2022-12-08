public class Keypad_Combination {
    final static char [][] keypad = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'}
                                          ,{'p','q','r','s'}, {'t','u','v'},{'w','x','y','z'}};


    public static void main(String[] args) {
        letterCombination("23");
    }
    public static void letterCombination(String number) {
        int len = number.length();
        if(len==0) System.out.println(" ");
        else bfs(0,len,new StringBuilder(),number);
       }

    private static void bfs(int pos, int len, StringBuilder sb, String number) {
        //base case
        if(pos==len) {
            System.out.println(sb.toString());
    }
       else {
            char[] Letters = keypad[Character.getNumericValue(number.charAt(pos))];
            for(int i = 0; i<Letters.length;i++) {
                bfs(pos+1,len,new StringBuilder(sb).append(Letters[i]),number);
            }
       }
    }

}
