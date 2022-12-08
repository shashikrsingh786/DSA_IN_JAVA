public class Convert_first_char_to_uppercase {
    public static void main(String[] args) {
        String s = "hi, my name is shashi";
        System.out.println(convert(s));
    }
    static  String convert(String s) {
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);
        for(int i = 1;i<s.length();i++) {
            if(s.charAt(i)==' ' && i<s.length()-1) {
                sb.append(s.charAt(i));
                sb.append(Character.toUpperCase(s.charAt(i+1)));
                i++;
            }
            else sb.append(s.charAt(i));
        }
        return  sb.toString();
        }
    }

