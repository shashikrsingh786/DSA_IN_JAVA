public class Build_a_tree {
    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        inorder(root);
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
