import java.util.LinkedList;
import java.util.Queue;

public class Traversal {

    public static class BinaryTree {
        public static void main(String[] args) {
            int[] Node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTreeB tree = new BinaryTreeB();
            Node root = tree.buildTree(Node);
            System.out.println("Root " + root.data);
            System.out.print("Preoder Traverse: "); preoderTraversal(root);           // preorder traversal
            System.out.println();
            System.out.print("Inorder Traverse: "); inorderTraversal(root);         // inorder traversal
            System.out.println();
            System.out.print("Postorder Traverse: "); postorderTraversal(root);      // postorder traversal
            System.out.println();
            System.out.println("Levelorder Traversal: "); levelorderTraversal(root);    // levelorder traversal

        }

        public static void preoderTraversal(Node root) {
            if(root == null) return ;
            System.out.print(root.data+" ");
            preoderTraversal(root.left);
            preoderTraversal(root.right);
        }

        public static void inorderTraversal(Node root) {
            if(root == null) return;
            inorderTraversal(root.left);
            System.out.print(root.data+" ");
            inorderTraversal(root.right);
        }

        public static void postorderTraversal(Node root) {
            if(root== null) return;
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print((root.data+" "));
        }

        public static void levelorderTraversal(Node root) {
            if(root==null) return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode==null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                }
                else {
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null) q.add(currNode.left);
                    if(currNode.right!=null) q.add(currNode.right);
                 }
            }
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
