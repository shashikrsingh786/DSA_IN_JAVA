public class Delete_a_node {
    public static void main(String[] args) {
        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        inorder(root);
        System.out.println();
        delete(root,6);
        System.out.println();
        inorder(root);
    }

    public static Node delete(Node root, int key) {
        if(root.data<key) {
           root.right =  delete(root.right,key);
        }
        if(root.data>key) {
           root.left =  delete(root.left,key);
        }
        if(root.data==key) {
            // case 1 = no child
            if(root.right==null && root.left==null) {
                return null;
            }
            // case 2 = one child
            if(root.left==null) return root.right;
            if(root.right==null)  return root.left;
           // case 3 = 2 children
            Node IS = inorderSuccesor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }
        return root;
    }

    public static Node  inorderSuccesor(Node root) {
        while(root.left!=null) {
            root = root.left;
        }
        return root;
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
