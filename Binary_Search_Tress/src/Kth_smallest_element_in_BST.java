public class Kth_smallest_element_in_BST {
    public static void main(String[] args) {
        int[] values = {8,5,11,3,6,20};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        inorder(root);
        int k = 3;
        printKthSmallest(root,k);
    }

    static int count = 0;


    public static void printKthSmallest(Node root, int k){
        Node res = kthSmallest(root,k);
        if (res == null)
            System.out.println("There are less than k nodes in the BST");
        else
            System.out.println("K-th Smallest Element is " + res.data);
    }
        public static Node kthSmallest(Node root, int k)  {
            if (root == null)
                return null;
            Node left = kthSmallest(root.left, k); // check if it exist in left subtree
            if (left != null)
                return left;
            count++;
            if (count == k)
                return root;
            return kthSmallest(root.right, k);        // if it not exist in left then shift to right subtree
        }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
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
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data < val) {
            root.right = insert(root.right, val);           // right subtree
        } else {
            root.left = insert(root.left, val);           // left subtree
        }
        return root;
    }
}
