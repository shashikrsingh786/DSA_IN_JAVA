public class Remove_a_cycle {
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
                if (slow == fast) {
                    removeCycle(fast);
                    return true;
                }
            }
            return false;                          // cycle do not exist
        }
        public void removeCycle(Node fast) {
            Node slow = head;
            while(fast.next!= slow.next) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
            tail = fast;
        }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();

            head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = head;
            System.out.println(ll.detectCycle());           // first detect cycle if it exist and remove
            System.out.println(ll.detectCycle());          // now after removing check again.
        }
    }
}
