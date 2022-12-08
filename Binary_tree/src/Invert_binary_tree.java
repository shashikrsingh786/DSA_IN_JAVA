public class Invert_binary_tree {

    public static class BinaryTree {
        public static void main(String[] args) {
            int[] Node = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
            BinaryTreeB tree = new BinaryTreeB();
            BinaryTree.Node root = tree.buildTree(Node);
            System.out.println(root.data);
            System.out.print("Before inversion Preoder Traverse: "); preoderTraversal(root);  // preorder traversal
            invert(root);
            System.out.println();
            System.out.print("After inversion Preoder Traverse: "); preoderTraversal(root);  // preorder traversal


        }

        public static void invert(Node root) {
            if(root==null) return;

            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            invert(root.left);
            invert(root.right);
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
