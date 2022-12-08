public class Preorder_traversal {

    public static class BinaryTree {
        public static void main(String[] args) {
            int[] Node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTreeB tree = new BinaryTreeB();
            Node root = tree.buildTree(Node);
            System.out.println(root.data);
            int k = 3;
            kthLevelofTree(root,1,k);

        }
        public static void kthLevelofTree(Node root,int level, int k) {
            if(root==null) return;
            if(level==k) {
                System.out.print(root.data + " ");
                return;
            }
            kthLevelofTree(root.left,level+1,k);
            kthLevelofTree(root.right,level+1,k);
        }
        public static class BinaryTreeB {
            static int idx = -1;
            static Node buildTree(int[] Node) {
                idx++;
                if(Node[idx]==-1) return null;
                Node newNode = new Node(Node[idx]);
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
