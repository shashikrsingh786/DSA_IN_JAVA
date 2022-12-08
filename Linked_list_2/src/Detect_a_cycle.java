public class Detect_a_cycle {
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

        public boolean detectCycle() {     // Floyd CFA
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next!=null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) return true;       // cycle exist
            }
            return false;                          // cycle do not exist
        }
        public void cycle(int data) {
            Node newNode = new Node(data);
            size++;
            tail.next = newNode;
            newNode.next = head.next.next;
        }
        public static void main(String[] args) {
            LinkedList ll = new LinkedList();

            ll.addLast(2);          // add last
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.cycle(6);
            System.out.println(ll.detectCycle());         // detect a cycle in ll
        }
    }
}
