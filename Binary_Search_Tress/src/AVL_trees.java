public class AVL_trees {
    public static void main(String[] args) {
         root = insert(root,10);
         root = insert(root,20);
         root = insert(root,30);
         root = insert(root,40);
         root = insert(root,50);
         root = insert(root,25);
         preorder(root);
    }

    public static void preorder(Node root) {
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node insert(Node root, int key) {
        if(root==null) {
            return new Node(key);
        }
        if(key>root.data) {
            root.right = insert(root.right,key);
        }
       else if(key<root.data) {
            root.left = insert(root.left,key);
        }
       else return root;     // duplicate keys not allowed

        // update root height
        root.height = Math.max(height(root.left),height(root.right))+1;

        // get root balanced factor
        int bf = getBalanced(root);

        // left left case
        if(bf>1 && key<root.left.data) {
         return rightRotation(root);
        }
        // left right case
        if(bf>1 && key>root.left.data) {
            root.left = leftRotation(root.left);
             return rightRotation(root);
        }
        // right right case
        if(bf<-1 && key>root.right.data) {
           return  leftRotation(root);
        }
        // right left case
        if(bf<-1 && key<root.right.data) {
          root.right = rightRotation(root.right);
          return leftRotation(root);
        }

        return root;   // return if AVL is balanced
    }

    public static int getBalanced(Node root) {
        if(root==null) return 0;
        return height(root.left)-height(root.right);
    }
    static class Node {
        int data,height;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.height = 1;
        }
    }
    public static Node leftRotation(Node root) {
        Node x = root.right;
        Node T2 = x.left;

        // perform operation
        x.left =  root;
        root.right = T2;

        // update heights
        root.height = Math.max(height(root.left),height(root.right))+1;
        x.height = Math.max(height(x.left),height(x.right))+1;

        // return new root
        return x;
    }

    public static Node rightRotation(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // perform operation
        x.right =  y;
        y.left = T2;

        // update heights
        y.height = Math.max(height(y.left),height(y.right))+1;
        x.height = Math.max(height(x.left),height(x.right))+1;

        // return new root
        return x;
    }
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    public static Node root;
}
