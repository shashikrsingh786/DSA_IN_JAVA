public class Queries_on_st {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        // segment trees  initialisation
        int[] tree = new int[arr.length*4];
        // building segment tree
        buildST(arr,tree,0,0,arr.length-1);
        // queries on st
       int ans =  getSum(arr,tree,2,5);
        System.out.println(ans);
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
    public static int getSum(int[] arr, int[] tree, int qi, int qj) {
        int n = arr.length;
        return getSumUtil(tree,0,0,n-1,qi,qj);
    }
    public static int getSumUtil( int[] tree,int i, int si, int sj, int qi, int qj ) {
        if(qi>=sj || qj<=si) {        // non-overlapping
           return 0;
        }
        else if(qi<=si && qj>=sj) {        // complete-overlapping
           return tree[i];
        }
        else {
            int mid = (si+sj)/2;
            int left = getSumUtil(tree,2*i+1,si,mid,qi,qj);
            int right = getSumUtil(tree,2*i+2,mid+1,sj,qi,qj);
            return left+right;
        }
    }
}
