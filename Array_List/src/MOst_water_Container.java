import java.util.ArrayList;

public class MOst_water_Container {
    public static void main(String[] args) {
        ArrayList<Integer>  height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int lp = 0;
        int maxWater=0;
        int rp = height.size()-1;
        while(lp<rp) {
            int heights = Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currWater = heights * width;
            maxWater = Math.max(currWater,maxWater);
            if(height.get(lp)<height.get(rp))  lp++;
            else rp--;
        }
        System.out.println(maxWater);
    }
}
