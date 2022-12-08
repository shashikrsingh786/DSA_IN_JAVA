public class Search_a_bst {
    public static void main(String[] args) {
        int[] values = {8,5,10,3,6,11,1,4,14};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        int k = 8;
        System.out.println("key "+ k + " is available? " + search(root,k));
        inorder(root);
    }

    public static boolean search(Node root, int key) {
        if (root == null) return false;
        if(root.data==key) return true;
        if (root.data < key) {
            return search(root.right, key);
        }
        else {
            return search(root.left, key);
        }
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
