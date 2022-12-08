public class Kth_ancestor_of_node {

    public static class BinaryTree {
        public static void main(String[] args) {
            int[] Node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTreeB tree = new BinaryTreeB();
            BinaryTree.Node root = tree.buildTree(Node);
            System.out.println(root.data);
            kthAncestorofNode(root,4,2);

        }
        public static int kthAncestorofNode(Node root, int n, int k) {
            if(root==null) return -1;
            if(root.data==n) return 0;

            int leftDist = kthAncestorofNode(root.left,n,k);
            int rightDist = kthAncestorofNode(root.right,n,k);

            if(leftDist==-1 && rightDist==-1) return -1;
            int max = Math.max(leftDist,rightDist);
            if(max+1==k) {
                System.out.println(root.data+" ");
            }
            return max+1;

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
