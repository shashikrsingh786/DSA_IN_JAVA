public class Sorted_array_to_balanced_bst {
    public static void main(String[] args) {
        int[] arr = {3,6,5,8,10,11,12};
        int si = 0, ei = arr.length-1;
        Node root = createBST(arr,si,ei);
        preOrder(root);
    }
    public static Node createBST(int[] arr, int si, int ei) {
        if(si>ei) return null;
        int mid = (si+ei)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr,si,mid-1);
        root.right = createBST(arr,mid+1,ei);
        return  root;
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
