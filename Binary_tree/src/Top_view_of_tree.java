import java.util.*;
public class Top_view_of_tree {

    public static class BinaryTree {
        public static void main(String[] args) {
            int[] Node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTreeB tree = new BinaryTreeB();
            Node root = tree.buildTree(Node);
            System.out.println(root.data);
            topView(root);

        }

        public static class Nodeinfo {
            Node node ;
            int hd;    // horizontal distance

            Nodeinfo(Node root,int hd) {
                this.node = root;
                this.hd = hd;
            }
        }
        public static  void topView(Node root) {
            Queue<Nodeinfo> q = new LinkedList<>();
            HashMap<Integer,Node> map = new HashMap<>();

            int min = 0,max = 0;
            q.add(new Nodeinfo(root, 0));
            q.add(null);

            while(!q.isEmpty()) {
                Nodeinfo curr = q.remove();
                if(curr==null) {
                    if(q.isEmpty()) {
                        break;
                    }
                    else {
                        q.add(null);
                    }
                }
                else {
                    if(!map.containsKey(curr.hd)) {
                        map.put(curr.hd,curr.node);
                    }
                    if(curr.node.left!=null) {
                        q.add(new Nodeinfo(curr.node.left, curr.hd - 1));
                        min = Math.min(min,curr.hd-1);
                    }
                    if(curr.node.right!=null) {
                        q.add(new Nodeinfo(curr.node.right, curr.hd + 1));
                        max = Math.max(max,curr.hd+1);
                    }
                }

            }
            for(int i = min;i<=max;i++) {
                System.out.print(map.get(i).data+" ");
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
