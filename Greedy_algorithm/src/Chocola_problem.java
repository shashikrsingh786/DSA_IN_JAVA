import java.util.Arrays;
import java.util.Collections;

public class Chocola_problem {
    public static void main(String[] args) {
        Integer[] costver = {2,1,3,1,4};
        Integer[] costhor = {4,1,2};

        Arrays.sort(costver, Collections.reverseOrder());
        Arrays.sort(costhor, Collections.reverseOrder());

        int v = 0, h = 0;   // vertical and horizontal track
        int vp = 1, hp = 1;   // vertical and horizontal cuts
        int cost = 0;

        while(v<costver.length && h<costhor.length) {
            if(costver[v] <= costhor[h]) {
                cost += costhor[h]*vp;
                h++;
                hp++;
            }
            else {
                cost += costver[v]*hp;
                v++;
                vp++;
            }
        }
        while(v<costver.length) {
            cost+=costver[v]*hp;
            v++;
            vp++;
        }
        while(h<costhor.length) {
            cost += costhor[h]*vp;
            h++;
            hp++;
        }

        System.out.println("Minimum cost is : " + cost);

    }
}
