import java.util.ArrayList;

public class Convert_BST_to_balanced_BST {
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        preOrder(root);
        root = balanceBST(root);
        System.out.println();
        preOrder(root);
    }

    public static Node balanceBST(Node root) {
        // inorder sequence
        ArrayList<Integer> al = new ArrayList<>();
        getInorder(root,al);
        // sorted inorder -> balanced BST
        root = createBST(al,0,al.size()-1);
        return  root;
    }

    public static Node createBST(ArrayList<Integer> arr, int si, int ei) {
        if(si>ei) return null;
        int mid = (si+ei)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr,si,mid-1);
        root.right = createBST(arr,mid+1,ei);
        return  root;
    }

    public static void getInorder(Node root,ArrayList<Integer> al) {
        if(root==null) return;
        getInorder(root.left,al);
        al.add(root.data);
        getInorder(root.right,al);
    }
    public static void preOrder(Node root) {
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
