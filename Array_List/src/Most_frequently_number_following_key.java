import java.util.ArrayList;

public class Most_frequently_number_following_key {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(2);
        al.add(2);
        al.add(2);
        al.add(3);

        int key = 2;
        int[] result = new int[200];
        int max = Integer.MIN_VALUE;
        int ans = 0;


        for(int i = 1;i<al.size();i++) {
           if(key==al.get(i-1))   {
               result[al.get(i)]++;
           }
        }
        for(int i=0; i< result.length; i++){
            if(result[i] > max){
                max = result[i];
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
