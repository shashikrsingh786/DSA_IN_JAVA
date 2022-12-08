public class Stacks_using_ll {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static  class Stacks {
        static Node head = null;
        public static boolean isEmpty() {
            return head == null;
        }
        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty())  {
                head = newNode;
                return;
            }
             newNode.next = head;
            head = newNode;
        }
        public  static int pop() {
            if(isEmpty()) return -1;
           int top = head.data;
           head = head.next;
           return top;
        }
        public static  int peek() {
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stacks sc = new Stacks();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        while(!sc.isEmpty()) {
            System.out.println(sc.peek());
            sc.pop();
        }
    }
}
