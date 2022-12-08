import java.util.ArrayList;

public class Merge_two_BST {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node newRoot = mergeBST(root,root2);
        preOrder(newRoot);
    }

    public static  void preOrder(Node root) {
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if(root==null) return;
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }

    public static Node mergeBST(Node root, Node root2) {
        // step 1 -> inorder for root
        ArrayList<Integer> al = new ArrayList<>();
        getInorder(root,al);
        // step 2 -> inorder for root2
        ArrayList<Integer> al2 = new ArrayList<>();
        getInorder(root2,al2);
        // step 3 -> merge two BST
        int i = 0, j =0;
        ArrayList<Integer> finalARR = new ArrayList<>();
        while(i<al.size() && j<al2.size()) {
            if(al.get(i)>al2.get(j)) {
                finalARR.add(al2.get(j));
                j++;
            }
            else {
                finalARR.add(al.get(i));
                i++;
            }
        }
        while(i<al.size()) {
            finalARR.add(al.get(i));
            i++;
        }
        while(j<al2.size()) {
            finalARR.add(al2.get(j));
            j++;
        }
        // step 4 -> create a balanced BST
         return createBST(finalARR,0,finalARR.size()-1);
    }


    public static Node createBST(ArrayList<Integer> arr, int si, int ei) {
        if(si>ei) return null;
        int mid = (si+ei)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr,si,mid-1);
        root.right = createBST(arr,mid+1,ei);
        return  root;
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
