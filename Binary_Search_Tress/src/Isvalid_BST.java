public class Isvalid_BST {
    public static void main(String[] args) {
        int[] values = {1,1,1};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        inorder(root);
        System.out.println(isValid(root,null,null));
    }


    public static boolean isValid(Node root, Node min, Node max) {
        if(root==null) return true;
        if(min!=null && root.data<=min.data) {
            return false;
        }
        if(max!=null && root.data>=max.data) {
            return false;
        }
        return isValid(root.left,min,root) && isValid(root.right,root,max);
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
