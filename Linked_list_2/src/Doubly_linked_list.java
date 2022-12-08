public class Doubly_linked_list {
    public static class DoublyLinkedList {
        public static class Node {
            int data;
            Node next;
            Node prev;
            Node(int data) {
                this.data = data;
                this.prev = null;
                this.next = null;
            }
        }
        public static Node head;
        public static Node tail;
        public void addFirst(int data) {
            Node newNode = new Node(data);
            if(head==null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        public void addLast(int data)
        {
            Node newNode = new Node(data);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        public void removeFirst() {
            head = head.next;
            head.prev = null;
        }
        public void removeLast() {
            tail = tail.prev;
            tail.next = null;
        }
        public void reverse() {
            Node next;
            Node curr = tail = head;
            Node prev = null;
            while(curr!=null) {
                next = curr.next;
                curr.next = prev;
                curr.prev = next;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        public void print()  {
            Node temp = head;
            System.out.print("null<->");
            while(temp!=null) {
                System.out.print(temp.data+"<->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
          DoublyLinkedList dll = new DoublyLinkedList();
          dll.addFirst(1);             // add first
          dll.addFirst(2);
          dll.addFirst(3);
          dll.print();                      // print a dbll
          dll.removeFirst();              // remove first
          dll.addFirst(4);
          dll.print();
          dll.addLast(7);               // add last
          dll.print();
          dll.removeLast();               // remove last
            dll.print();
            dll.reverse();            // reverse a dbll
            dll.print();
        }
    }
}
