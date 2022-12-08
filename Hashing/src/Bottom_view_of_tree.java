import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Bottom_view_of_tree {
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        System.out.println(
                "Bottom view of the given binary tree:");
        bottomView(root);

    }

    public static void bottomView(Node root) {
        Queue<Nodeinfo> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Nodeinfo(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Nodeinfo curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                    map.put(curr.hd,curr.node);
                if (curr.node.left != null) {
                    q.add(new Nodeinfo(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Nodeinfo(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }

        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }

    }

    static class Node {
        int data;
        int hd;
        Node left, right;

        public Node(int key) {
            this.data = key;
            this.hd = Integer.MAX_VALUE;
            this.left = this.right = null;
        }
    }

    public static class Nodeinfo {
        Node node;
        int hd;    // horizontal distance

        Nodeinfo(Node root, int hd) {
            this.node = root;
            this.hd = hd;
        }
    }
}
