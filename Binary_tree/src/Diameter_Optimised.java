public class Diameter_Optimised {
    public static class BinaryTree {
        public static void main(String[] args) {
            int[] Node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTreeB tree = new BinaryTreeB();
            BinaryTree.Node root = tree.buildTree(Node);
            System.out.println(root.data);
            System.out.println("Diameter of Tree: " + diameter(root).diameter);     // diameter tc -o(n)

        }
        public static Nodeinfo  diameter(Node root) {
            if(root==null) return new Nodeinfo(0,0);
            Nodeinfo linfo = diameter(root.left);
            Nodeinfo rinfo = diameter(root.right);

            int diam = Math.max(Math.max(linfo.diameter,rinfo.diameter),linfo.height+rinfo.height+1);
            int ht = Math.max(linfo.height,rinfo.height)+1;

            return new Nodeinfo(diam,ht);
        }

        public static class Nodeinfo {
            int diameter;
            int height ;
            public Nodeinfo(int diam, int height) {
                this.diameter = diam;
                this.height = height;
            }
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
