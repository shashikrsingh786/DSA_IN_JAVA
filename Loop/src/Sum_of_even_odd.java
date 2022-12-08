import java.util.Scanner;

public class Sum_of_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WHENEVER YOU WANT  TO STOP PRESS 0");
        int n,count;
        int sumEVEN = 0;
        int sumODD = 0;
        do {
            System.out.print("enter the number: ");
            n = sc.nextInt();
            if(n%2==0)  sumEVEN += n;
            else  sumODD+= n;
            System.out.println("do you want to stop");
            count = sc.nextInt();
        } while(count!=0);
        System.out.println("even sum is: " + sumEVEN + "\n" +  "odd sum is: " + sumODD);
    }
}
