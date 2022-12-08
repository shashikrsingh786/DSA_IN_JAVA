public class Range_sum_in_BST {
    public static void main(String[] args) {
        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        inorder(root);
        System.out.println();
        int l = 3, r = 11;
        System.out.println("range sum is : " + rangeSum(root,l,r));

    }

    public static int RangeSum = 0;

    public static int rangeSum(Node root, int l, int r) {
        if(root==null) return 0;
        if(l<=root.data && root.data<=r) {
            rangeSum(root.left,l,r);
            RangeSum+=root.data;
            rangeSum(root.right,l,r);
        }
        else if(root.data<l) rangeSum(root.right,l,r);
            // case 3
        else {
            rangeSum(root.left,l,r);
        }
        return RangeSum;
    }

    public static void inorder(Node root) {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root, int val) {
        if(root==null)  {
            root = new Node(val);
            return root;
        }
        if(root.data<val) {
            root.right =  insert(root.right,val);           // right subtree
        }
        else {
            root.left = insert(root.left,val);           // left subtree
        }
        return root;
    }
}
