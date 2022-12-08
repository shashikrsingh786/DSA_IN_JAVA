public class Two_sum_BST {
    public static void main(String[] args) {
        int[] values = {5,3,7,2,4,6,8};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        preOrder(root);
        twoSum(root);
        System.out.println();
        preOrder(root);
    }

    public static int sum = 0;

    public static void twoSum(Node root) {
        if(root ==null) return;

        // recur for right subtree
        twoSum(root.right);
        // update sum
        sum = sum + root.data;
        // store old sum in current node
        root.data = sum - root.data;
        // recur for left subtree
        twoSum(root.left);
    }

    public static void preOrder(Node root) {
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root,int val) {
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
