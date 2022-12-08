public class Maximum_path_sum_in_binary_tree {

    public static class BinaryTree {
        public static void main(String[] args) {
            int[] Node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTreeB tree = new BinaryTreeB();
            Node root = tree.buildTree(Node);
            System.out.println(root.data);
            System.out.println(findMaxSum(root));

        }

        public static int maxPath(Node root, Res res) {
            if (root == null) return 0;
            int sumLeft = maxPath(root.left, res);
            int sumRight = maxPath(root.right, res);

            int max_single = Math.max(Math.max(sumRight,sumLeft)+root.data,root.data);
            int max_top = Math.max(max_single,root.data+sumLeft+sumRight);

            res.val = Math.max(res.val,max_top);

            return max_single;
        }

        static class Res {
            public int val;
        }
       static int findMaxSum(Node node) {
            Res res = new Res();
            res.val = Integer.MIN_VALUE;
            maxPath(node, res);
            return res.val;
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
