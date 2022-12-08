public class Min_distance_between_nodes {

    public static  class BinaryTree {
        public static void main(String[] args) {
            int[] Node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTreeB tree = new BinaryTreeB();
            BinaryTree.Node root = tree.buildTree(Node);
            System.out.println(root.data);
            System.out.println(mindistance(root,4,6));

        }
        public static int mindistance(Node root, int n1,int n2) {
            Node lca = lowestCommonAncestor2(root,n1,n2);
            int leftdist = lcadistance(lca,n1);
            int rightdist = lcadistance(lca,n2);

            return leftdist+rightdist;
        }

        public static int lcadistance(Node root, int n) {
            if(root==null) return -1;
            if(root.data==n) return 0;

            int leftDist = lcadistance(root.left,n);
            int rightDist = lcadistance(root.right,n);

            if(leftDist==-1 && rightDist==-1) {
                return -1;
            }
            else if(leftDist==-1) {
                return rightDist+1;
            }
            else return leftDist+1;
        }
        public static Node lowestCommonAncestor2(Node root, int  n1, int n2) {
            if(root==null || root.data == n1 || root.data==n2) {
                return root;
            }
            Node leftLca = lowestCommonAncestor2(root.left,n1,n2);
            Node rightLca = lowestCommonAncestor2(root.right,n1,n2);

            if(rightLca==null) {
                return leftLca;
            }
            if(leftLca==null) {
                return rightLca;
            }
            return root;
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
