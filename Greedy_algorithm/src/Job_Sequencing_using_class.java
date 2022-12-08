import java.util.ArrayList;
import java.util.Collections;

public class Job_Sequencing_using_class {
    public static void main(String[] args) {
        int[][] jobInfo = {{4,20},{1,10},{1,40},{1,30}};


        ArrayList<Job> job = new ArrayList<>();
        for(int i = 0;i< jobInfo.length;i++) {
            job.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }
        ArrayList<Integer> jobSeq = new ArrayList<>();

        Collections.sort(job,(a,b) -> b.profit-a.profit);
        // discending order of sorting

        int time = 0;
        for(int i = 0; i<job.size();i++) {
            Job curr = job.get(i);
            if(time<curr.deadLine) {
                time++;
                jobSeq.add(curr.index);
            }
        }
        System.out.println(time);
        for(int i = 0;i<jobSeq.size();i++) {
            System.out.print(jobSeq.get(i)+" ");
        }
    }
    public static class Job {
        int index;
        int deadLine;
        int profit;
        Job(int i, int deadLine, int profit) {
            this.index = i;
            this.deadLine = deadLine;
            this.profit = profit;
        }
    }
}
