public class Update_on_st {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        // segment trees  initialisation
        int[] tree = new int[arr.length*4];
        // building segment tree
        buildST(arr,tree,0,0,arr.length-1);
        // updating tree
        updateST(arr,tree,2,2);
        // updated tree
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
    public static void updateST(int[] arr, int[] tree, int idx, int newVal) {
        int n = arr.length;
        int diff = newVal-arr[idx];
        arr[idx] = newVal;
        updateUtilST(tree,0,n-1,0,idx,diff);
    }
    public static void  updateUtilST(int[] tree, int si, int sj,int i, int idx, int diff) {
        if(idx>sj || idx<si) {
            return;
        }
        tree[i] += diff;

        if(si!=sj) {   // non-leaf
            int mid = (si+sj)/2;
            updateUtilST(tree,si,mid,2*i+1,idx,diff);       // left
            updateUtilST(tree,mid+1,sj,2*i+2,idx,diff);   // right
        }
    }
}
