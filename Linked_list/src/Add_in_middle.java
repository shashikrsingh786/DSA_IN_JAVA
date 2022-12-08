public class Add_in_middle {
    public static class LinkedList {
        public static class Node {           // blueprint of a node
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

        public void addFirst(int data) {            // add at first
            //create new node
            Node newNode = new Node(data);
            size++;

            if (head == null) {
                head = tail = newNode;
                return;                           //head is null
            }
            //point to head
            newNode.next = head;
            //make newNode head
            head = newNode;
        }

        public void addLast(int data) {
            //create new node
            Node newNode = new Node(data);
            size++;
            if(head==null) {
                head = tail = newNode;
                return;
            }
            // current tail next point to newNode
            tail.next = newNode;
            //tail become newNode
            tail = newNode;
        }
        public void print() {
            Node temp = head;
            while(temp!=null) {
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public void addInMiddle(int data, int index) {
            if(index==0) {
                addFirst(data);
                return;
            }
            //create new node
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;
            while(index-1>i) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }


        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            ll.addFirst(1);              // add first
            ll.addLast(2);          // add last
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.addInMiddle(6,1);                  // add in somewhere middle of ll.
            ll.print();                   // print ll
            System.out.println(ll.size);                // size of ll
        }
    }
}
