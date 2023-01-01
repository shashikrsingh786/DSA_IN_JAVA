public class Disjoint_set {
    public static void main(String[] args) {
        init();
        union(1,3);
        System.out.println(find(3));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(find(3));
        union(1,5);
        System.out.println(find(4));
    }
    static int n = 7;
    static int[] par = new int[n];
    static int[] rank = new int[n];
    static void init() {
        for(int i= 0;i<par.length;i++) {
            par[i] = i;
        }
    }
    static int find(int x) {
        if(x==par[x]) {
            return x;
        }
        return par[x] = find(par[x]);    // path compression
    }
    static void union(int a, int b) {
        int par1 = find(a);   // find parent of a
        int par2 = find(b);   // find parent of b

        if(rank[par1]==rank[par2]) {
            par[par2] = par1;
            rank[par1]++;
        }
        else if(rank[par1]>rank[par2]) par[par2] = par1;
        else par[par1] = par2;
    }
}
