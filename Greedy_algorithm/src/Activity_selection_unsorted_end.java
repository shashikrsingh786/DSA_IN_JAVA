import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_selection_unsorted_end {
    public static void main(String[] args) {
        int[] start = {0,1,3,5,5,8};
        int[] end =   {6,2,4,7,9,9};

        int[][] activities = new int[start.length][3];

        for(int i = 0;i<start.length;i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i = 1;i<start.length;i++) {
            if(activities[i][1]>=lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max number of activities is :" + maxAct);
        for(int i = 0;i<maxAct;i++) {
            System.out.print("A"+ans.get(i)+" ");
        }


    }
}
// same logic for max length of chain .
