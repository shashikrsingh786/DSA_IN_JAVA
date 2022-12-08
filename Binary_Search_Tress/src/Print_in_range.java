public class Print_in_range {
    public static void main(String[] args) {
        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        inorder(root);
        System.out.println();
        printInrange(root,1,5);
    }

    public static void printInrange(Node root, int k1, int k2) {
        if(root==null) return;
        // case 1
        if(root.data>=k1 && root.data<=k2) {
            printInrange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInrange(root.right,k1,k2);
        }
        // case 2
       else if(root.data<k1) printInrange(root.right,k1,k2);
       // case 3
       else {
           printInrange(root.left,k1,k2);
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
