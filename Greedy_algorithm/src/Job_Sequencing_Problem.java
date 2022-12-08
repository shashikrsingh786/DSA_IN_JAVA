import java.util.Arrays;
import java.util.Comparator;

public class Job_Sequencing_Problem {
    public static void main(String[] args) {
            int[][] jobSeq = {{4,20},{1,10},{1,40},{1,30}};
            Arrays.sort(jobSeq, Comparator.comparingDouble(o->o[1]));
            int time = 0;
            int profit = 0;

            for(int i =jobSeq.length-1;i>=0;i--) {
                if(time<jobSeq[i][0]) {
                    time++;
                    profit += jobSeq[i][1];
                }
            }
        System.out.println(profit);
    }
}
