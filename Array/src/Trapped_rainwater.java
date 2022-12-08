public class Trapped_rainwater {
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        System.out.println(trappedwater(height));
    }
    static int trappedwater(int[] height) {
        int Trappedwater=0;
        //left max for height
        int[] leftmax  = new int[height.length];
        leftmax[0] = height[0];
        for(int i = 1; i<leftmax.length;i++) {
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        //right max for height
        int[] rightmax = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i = height.length-2;i>=0;i--) {
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
         //loop
        for(int i = 0; i< height.length;i++) {
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            Trappedwater += waterlevel - height[i];
        }
        return  Trappedwater;
    }
}