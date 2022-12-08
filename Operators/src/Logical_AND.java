public class Logical_AND {

    public static void main(String[] args) {
        int x = 200, y = 50, z = 100;
        if (x > y && y > z) {
            System.out.println("Hello");   //no print
        }
        if (z > y && z < x) {              // will print
            System.out.println("Java");
        }
        if ((y + 200) < x && (y + 150) < z) {          //no print
            System.out.println("Hello Java");
        }


    }
}