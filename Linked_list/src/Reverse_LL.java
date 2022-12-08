public class Reverse_LL {
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
        public void reverseLL() {
           Node next;
           Node curr = tail = head;
           Node prev = null;
           while(curr!=null) {
               next = curr.next;
               curr.next = prev;
               prev = curr;
               curr = next;
            }
           head = prev;


        }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();

            ll.addLast(2);          // add last
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.print();
            ll.reverseLL();             // reverse a ll
            ll.print();
        }
    }
}
