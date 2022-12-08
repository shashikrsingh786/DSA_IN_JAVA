public class Subtree_of_another_tree {

    public static class BinaryTree {
        public static void main(String[] args) {
            int[] Node = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTreeB tree = new BinaryTreeB();
            Node root = tree.buildTree(Node);
            Node root1 = new Node(2);
            root1.left = new Node(4);
            root1.right = new Node(5);
            System.out.println(subtree(root, root1));

        }

        public static boolean subtree(Node root, Node root1) {
            if(root==null) return false;
            if (root.data == root1.data) {
                if (isIdentical(root, root1)) {
                    return true;
                }
            }
            return subtree(root.left, root1) || subtree(root.right, root1);
        }

        public static boolean isIdentical(Node root,Node subroot) {
           if(root==null && subroot==null) return true;
           else if(root==null || subroot==null || root.data!=subroot.data)
           {
               return false;
           }
           if(!isIdentical(root.left,subroot.left)) {
               return false;
           }
           if(!isIdentical(root.right,subroot.right)) {
               return  false;
           }
           return true;
        }

        public static class BinaryTreeB {
            static int idx = -1;

            static Node buildTree(int[] Node) {
                idx++;
                if (Node[idx] == -1) return null;
                Node newNode = new Node(Node[idx]);
                newNode.left = buildTree(Node);
                newNode.right = buildTree(Node);

                return newNode;
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
