public class Maximum_sum_of_BST_in_BT {
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(9);
        root.left.left = new Node(6);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(7);

        root.right = new Node(2);
        root.right.right = new Node(3);

        Info info = maxSumBST(root);
        System.out.println("Largest Sum BST IN BT is : " + maxSum);
    }

    public static int maxSum = 0;

    public static Info maxSumBST(Node root) {
        if(root==null) {
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info leftInfo = maxSumBST(root.left);
        Info rightInfo = maxSumBST(root.right);

        int sum = leftInfo.sum+ rightInfo.sum+root.data;
        int min = Math.min(Math.min(leftInfo.min,rightInfo.min),root.data);
        int max = Math.max(Math.max(leftInfo.max, rightInfo.max),root.data);
        if(leftInfo.max>root.data || rightInfo.min<root.data) {
            return new Info(false,sum,min,max);
        }
        if(leftInfo.isBST && rightInfo.isBST) {
            maxSum = Math.max(maxSum,sum);
            return new Info(true,sum,min,max);
        }
        return new Info(false,sum,min,max);

    }

    public static class Info {
        boolean isBST;
        int sum;
        int min;
        int max;

        Info(boolean isBST,int sum, int min, int max) {
            this.isBST = isBST;
            this.sum = sum;
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
