public class Transform_to_sum_tree {

    public static class BinaryTree {
        public static void main(String[] args) {
            int[] Node = {1,2,4,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
            BinaryTreeB tree = new BinaryTreeB();
            BinaryTree.Node root = tree.buildTree(Node);
            System.out.println(root.data);
            transform(root);
            System.out.print("Preoder Traverse: "); preoderTraversal(root);           // preorder traversal

        }
        public static void preoderTraversal(Node root) {
            if(root == null) return ;
            System.out.print(root.data+" ");
            preoderTraversal(root.left);
            preoderTraversal(root.right);
        }

        public static int transform(Node root) {
            if(root==null) return 0;
            int temp = root.data;
            int leftSum = transform(root.left);
            int rightSum = transform(root.right);

            root.data = leftSum+rightSum;
            return temp+root.data;
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
