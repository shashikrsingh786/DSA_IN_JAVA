public class String_compression {
    public static void main(String[] args) {
        String s  ="abccc";
        System.out.println(compress(s));
    }
    static String compress(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++) {
            int count =1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
                i++;
                count++;
            }
            sb.append(s.charAt(i));
            if(count>1) sb.append(count);
        }
        return sb.toString();
    }
}
