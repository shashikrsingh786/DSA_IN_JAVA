public class Queue_using_linked_list {
    public static void main(String[] args) {
        Queue s = new Queue();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.remove();
        System.out.println("Peek element is: "+s.peek());
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }
    }
        public static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    public static class Queue {

        public static Node head = null;
        public static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if(head==null)  {
                head=tail=newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int front = head.data;
            // if single element exist
            if(head==tail) head=tail=null;
            else {
                head = head.next;
            }
            return front;
        }

        public static int peek() {
            if(isEmpty())  {
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }
    }
}
