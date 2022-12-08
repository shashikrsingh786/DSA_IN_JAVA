public class Delete_leaf_node_of_valueK {

    public static class BinaryTree {
        public static void main(String[] args) {
            int[] Node = {1,3,3,-1,-1,2,-1,-1,3,-1,-1};
            BinaryTreeB tree = new BinaryTreeB();
            BinaryTree.Node root = tree.buildTree(Node);
            System.out.println(root.data);
            System.out.print("Before deletion: "); preoderTraversal(root);  // preorder traversal
            deleteLeaf(root,3);
            System.out.println();
            System.out.print("After deletion: "); preoderTraversal(root);

        }

        public static Node deleteLeaf(Node root, int k) {
            if(root==null) return null;
           root.left = deleteLeaf(root.left,k);
           root.right = deleteLeaf(root.right,k);

           if(root.data==k && root.left==null && root.right==null) {
               return null;
           }
           return root;
        }
        public static void preoderTraversal(Node root) {
            if(root == null) return ;
            System.out.print(root.data+" ");
            preoderTraversal(root.left);
            preoderTraversal(root.right);
        }
        public static class BinaryTreeB {
            static int idx = -1;
            static Node buildTree(int[] Node) {
                idx++;
                if(Node[idx]==-1) return null;
                BinaryTree.Node newNode = new Node(Node[idx]);
                newNode.left = buildTree(Node);
                newNode.right = buildTree(Node);

                return  newNode;
            }
        }
        public static class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
    }

}
