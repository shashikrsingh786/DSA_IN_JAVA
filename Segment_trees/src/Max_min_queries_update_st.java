public class Max_min_queries_update_st {
    public static int[] tree;
    public static void main(String[] args) {
        int[] arr = {6,8,-1,2,17,1,3,2,4};
        init(arr);                                                            // init tree
        buildST(arr,0,0,arr.length-1);                                         // build tree

        for(int i : tree) {                                                  // print
            System.out.print(i+" ");

        }
        System.out.println();
        int ans =  getMax(arr,0,3);                                    // query
        System.out.println(ans);

        update(arr,5,18);                                                           // update ST
        for(int i : tree) {                                                  // print
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
    public static int getMax(int[] arr,int qi, int qj) {
        int n = arr.length;
        return getMaxUtil(0,0,n-1,qi,qj);
    }
    public static int getMaxUtil( int i, int si, int sj, int qi, int qj ) {
        if(qi>=sj || qj<=si) {        // non-overlapping
            return Integer.MIN_VALUE;
        }
        else if(qi<=si && qj>=sj) {        // complete-overlapping
            return tree[i];
        }
        else {
            int mid = (si+sj)/2;
            int left = getMaxUtil(2*i+1,si,mid,qi,qj);
            int right = getMaxUtil(2*i+2,mid+1,sj,qi,qj);
            return Math.max(left,right);
        }
    }

    public static void update(int[] arr, int idx, int newVal) {
        int n = arr.length;
        arr[idx] = newVal;
        updateUtil(0,0,n-1,idx,newVal);
    }
    public static void updateUtil(int i, int si, int sj,int idx, int newVal) {
        if(idx<si || idx>sj) {
            return;
        }
        if(si==sj) {
            tree[i] = newVal;
        }
        if(si!=sj) {
            int mid = (si+sj)/2;
            updateUtil(2*i+1,si,mid,idx,newVal);       // left
            updateUtil(2*i+2,mid+1,sj,idx,newVal);    // right
            tree[i] = Math.max(tree[2*i+1],tree[2*i+2]);
        }
    }

}
