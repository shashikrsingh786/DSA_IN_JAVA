public class Add_one_to_integer {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(addOne(n));
    }
    static int addOne(int n) {
    return -~n;
    }
}

//-x = ~x + 1;
// -~x = x + 1 (by replacing x by ~x)
//Remember negative numbers are stored in 2’s complement form).
// -5 = ~5+1
