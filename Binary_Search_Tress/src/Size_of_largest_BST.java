public class Size_of_largest_BST {
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        Info info = largestBST(root);
        System.out.println("largest BST size is : " + maxSize );
    }
    public static int maxSize = 0;

    public static Info largestBST(Node root) {
        if(root==null) {
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size+rightInfo.size+1;
        int min = Math.min(Math.min(leftInfo.min,rightInfo.min),root.data);
        int max = Math.max(Math.max(leftInfo.max, rightInfo.max),root.data);

        if(leftInfo.max>root.data || rightInfo.min<root.data) {
            return new Info(false,size,min,max);
        }
        if(leftInfo.isBST && rightInfo.isBST) {
            maxSize =  Math.max(size,maxSize);
            return new Info(true,size,min,max);
        }
        return new Info(false,size,min,max);
    }

    public static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        Info(boolean isBST,int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.max = max;
            this.min = min;
        }
    }
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
