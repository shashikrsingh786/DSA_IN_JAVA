public class Length_of_string {
    public static void main(String[] args) {
        String s = "my name is shashi";
        System.out.println(lengthOfString(s));
    }

    private static int lengthOfString(String s) {
        if(s.length()==0) {
            return 0;
        }
        return   lengthOfString(s.substring(1)) +1;
    }
}
