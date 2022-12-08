import java.util.Arrays;

public class Indian_coins {
    public static void main(String[] args) {
        int[] coin = {1,2,5,10,20,50,100,200,500,2000};
        // sort coin
        Arrays.sort(coin);
        int count = 0;
        int v = 2787;
        StringBuilder str = new StringBuilder();

        for(int i = coin.length-1;i>=0;i--) {
            if(coin[i]<=v) {
                while (coin[i] <= v) {
                    str.append(coin[i]).append(" ");
                    count++;
                    v -= coin[i];
                }
            }
        }
        System.out.println("no. of notes:" + count + "\n" +  str);
        char  i=  65;
        System.out.println(i);
    }
}
