public class Max_min_creation_st {
    public static int[] tree;
    public static void main(String[] args) {
        int[] arr = {6,8,-1,2,17,1,3,2,4};
        // init tree
        init(arr);
        // build tree
        buildST(arr,0,0,arr.length-1);
        // print
        for(int i : tree) {
            System.out.print(i+" ");
        }
    }
    public static void init(int[] arr) {
        tree = new int[4*arr.length];
    }
    public static void buildST(int[] arr, int i, int st, int end) {
        if(st==end) {
            tree[i] = arr[st];
            return;
        }
        int mid = (st+end)/2;
        buildST(arr,2*i+1,st,mid);
        buildST(arr,2*i+2,mid+1,end);
        tree[i] = Math.max(tree[2*i+1],tree[2*i+2]);
    }
}
