import java.util.Scanner;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean c;
        do {
            System.out.println("enter length of rectangle: ");
            int l = sc.nextInt();
            System.out.println("enter breadth of rectangle: ");
            int b = sc.nextInt();
            for (int i = 1; i <= l; i++) {
                for (int j = 1; j <= b; j++) {
                    if ((i == 1 || i == l) || (j == 1) || (j == b))
                        System.out.print(" * ");
                    else System.out.print("   ");
                }
                System.out.println();
            }
            System.out.println("wanna do it again(type true)");
             c = sc.nextBoolean();
        } while(c);
    }
}
