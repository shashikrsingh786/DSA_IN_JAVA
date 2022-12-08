public class Swapping_nodes {
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
        public void swap(int x, int y) {
            if (x == y)
                return;
            Node prevX = null, currX = head;
            while (currX != null && currX.data != x) {
                prevX = currX;
                currX = currX.next;
            }
            Node prevY = null, currY = head;
            while (currY != null && currY.data != y) {
                prevY = currY;
                currY = currY.next;
            }
            if (currX == null || currY == null)
                return;
            if (prevX != null)
                prevX.next = currY;
            else
                head = currY;
            if (prevY != null)
                prevY.next = currX;
            else
                head = currX;

            Node temp = currX.next;
            currX.next = currY.next;
            currY.next = temp;
        }
        public static void main(String[] args) {
            LinkedList ll = new LinkedList();

            ll.addLast(2);          // add last
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.print();
            ll.swap(3,5);
            ll.print();
        }
    }
}
