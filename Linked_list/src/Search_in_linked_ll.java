public class Search_in_linked_ll {
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

        public int search(int key) {
            Node temp = head;
            int i =0;
            while(temp!=null) {
                if(temp.data==key)       return i;
                temp = temp.next;
                i++;
            }
            return -1;
        }

        public int search_Recursion(int key,Node head) {
            if(head==null) {
                return -1;
            }
            if(head.data==key) {
                return  0;
            }
            int idx = search_Recursion(key,head.next);
            if(idx==-1) {
                return -1;
            }
            return idx+1;
        }

        public int search_rec(int key) {
            return search_Recursion(key,head);
        }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();

            ll.addLast(2);          // add last
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.print();                  // print ll
            System.out.println(ll.search(5));            // iterative approach
            System.out.println(ll.search_rec(5));      // recursive approach

        }
    }
}

