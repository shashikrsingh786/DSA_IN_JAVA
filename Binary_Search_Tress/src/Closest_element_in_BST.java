public class Closest_element_in_BST {
    public static void main(String[] args) {
        int[] values = {8,5,11,3,6,20};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        inorder(root);
        int key = 7;
        System.out.println("Closest Difference is :  " + closestDiff(root,key));
    }

    public static int diff = Integer.MAX_VALUE;

    public static int closestDiff(Node root,int key) {
        if(root==null) return 0;
        diff = Math.abs(Math.min((root.data-key),diff));
        if(key==root.data) {
            return 0;
        }
        if(key<root.data) {
            closestDiff(root.left,key);
        }
        else {
             closestDiff(root.right, key);
        }
        return diff;
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
