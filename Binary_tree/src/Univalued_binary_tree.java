public class Univalued_binary_tree {

    public static class BinaryTree {
        public static void main(String[] args) {
            int[] Node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTreeB tree = new BinaryTreeB();
            BinaryTree.Node root = tree.buildTree(Node);
            System.out.println(root.data);
            System.out.println(isUnivalued(root));

        }

        public static boolean isUnivalued(Node root) {
            if(root==null) return true;
            if(root.left!=null && root.data==root.left.data) return false;
            if(root.left!=null && root.data==root.right.data) return false;
            boolean left = isUnivalued(root.left);
            boolean right = isUnivalued(root.right);

            return (left && right);
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
