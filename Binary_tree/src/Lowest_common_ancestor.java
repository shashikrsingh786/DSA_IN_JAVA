import java.util.ArrayList;


public class Lowest_common_ancestor {

    public static class BinaryTree {
        public static void main(String[] args) {
            int[] Node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTreeB tree = new BinaryTreeB();
            BinaryTree.Node root = tree.buildTree(Node);
            System.out.println(root.data);
            System.out.println(lowestCommonAncestor(root,4,6));            // approach -1
            System.out.println(lowestCommonAncestor2(root,4,6).data);

        }

        public static int lowestCommonAncestor(Node root,int n1, int n2) {
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root,n1,path1);
            getPath(root,n2,path2);

            int i = 0;
            for(;i<path1.size() && i<path2.size();i++) {
                if(path1.get(i) != path2.get(i)) {
                    break;
                }
            }
            Node lcd = path1.get(i-1);
            return lcd.data;
        }

        public static boolean getPath(Node root, int n, ArrayList<Node> path) {
            if(root==null) return false;
            path.add(root);
            if(root.data==n) {
                return true;
            }
            boolean foundLeft = getPath(root.left,n,path);
            boolean foundRight = getPath(root.right,n,path);

            if(foundRight || foundLeft) {
                return true;
            }
            path.remove(path.size()-1);
            return false;
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
