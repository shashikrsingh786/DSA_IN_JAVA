public class  Remove_in_linkedList {
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
            while(temp!=null) {
                System.out.print(temp.data+"->");
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

        public int removeFirst() {
            if(size==0) {
                System.out.println("ll is empty");
                return Integer.MAX_VALUE;
            }
            else if(size==1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
        public void removeLast() {
            if(size==1) {
                head = tail = null;
                size=0;
            }
            else if( size==0) {
                System.out.println("ll is empty");
            }
            Node prev = head;
            int i = 0;
            while(i<size-2) {
                prev = prev.next;
                i++;
            }                                  // we can add deleted node also as int val = prev.next.data;
            prev.next = null;
            prev = tail;
            size--;
        }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();

            ll.addLast(2);          // add last
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.print();                   // print ll
            ll.removeFirst();             // remove at first index
            ll.print();
            ll.removeLast();             // remove at last index
            ll.print();
        }
    }
}
