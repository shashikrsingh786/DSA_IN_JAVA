public class Creation_of_st {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        // segment trees  initialisation
        int[] tree = new int[arr.length*4];
        // building segment tree
        buildST(arr,tree,0,0,arr.length-1);
        // printing tree
        for(int i : tree) {
            System.out.print(i+" ");
        }
    }
    public static void buildST(int[] arr, int[] tree, int i, int st, int end) {
        if(st==end) {
            tree[i] = arr[st];
            return;
        }
        int mid = (st+end)/2;
        buildST(arr,tree,2*i+1,st,mid);     // for element at 2*i+1
        buildST(arr,tree,2*i+2,mid+1,end);        // for element at 2*i+2
        tree[i] = tree[2*i+1] + tree[2*i+2];
    }
}
