public class Add_node_at_first_and_last_and_print {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
    }
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

        public void addFirst(int data) {            // add at first
            //create new node
            Node newNode = new Node(data);
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



        }
    }
