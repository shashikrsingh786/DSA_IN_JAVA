public class UpperCase_LowerCase {
    public static void main(String[] args) {
        char upper = 'Y';
        char lower = 'i';
        System.out.println(toLowerCase(upper));
        System.out.println(toUpperCase(lower));
    }

    static char toLowerCase(char alphabet) {
        return (char) (alphabet | ' ');
    }

    static char toUpperCase(char alphabet) {
        return (char) (alphabet ^ ' ');

    }
}
