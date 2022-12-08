public class Zig_zag_in_ll {
    public static class LinkedList {
        public static class Node {            // blueprint of a node
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static Node head;
        public static Node tail;
        public static int size;

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void addLast(int data) {
            //create new node
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
            // current tail next point to newNode
            tail.next = newNode;
            //tail become newNode
            tail = newNode;
        }
        public void zigZag() {
            // find middle
            Node midNode = findMiddle();
            // reverse second half
            Node prev = null;
            Node curr = midNode;
            Node next;
            while(curr!=null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            //alternate merging
            Node right = prev;       // head for right half
            Node left = head;        // head for left half
            Node nextL,nextR;
            while(right!=null && left!=null) {
                nextL = left.next;         // zig - zag
                left.next = right;
                nextR = right.next;
                right.next = nextL;       // zig-zag

                right = nextR;
                left = nextL;
            }
        }
        public Node findMiddle() {
            Node slow = head;
            Node fast = head.next;
            while(fast!=null && fast.next!=null) {
                slow= slow.next;       // +1
                fast = fast.next.next;     // +2
            }
            return slow;               // middle
        }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();

            ll.addLast(2);          // add last
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.print();
            ll.zigZag();
            ll.print();
        }
    }
}
