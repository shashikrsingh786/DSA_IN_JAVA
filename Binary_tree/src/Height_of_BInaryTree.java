public class Height_of_BInaryTree {
    public static class BinaryTree {
        public static void main(String[] args) {
            int[] Node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTreeB tree = new BinaryTreeB();
            Node root = tree.buildTree(Node);
            System.out.println("Root of tree: "+ root.data);
            System.out.println("Height of tree: " + height(root));        // height of tree

        }

        public static int height(Node root) {
            if(root==null) return 0;

            int lh = height(root.left);
            int rh = height(root.right);

            return Math.max(lh,rh)+1;
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
