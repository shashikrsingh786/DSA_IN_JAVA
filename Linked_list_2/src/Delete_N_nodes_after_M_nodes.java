public class Delete_N_nodes_after_M_nodes {
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
        public void deleteMN(int m, int n) {
           Node curr = head;
           while(curr!=null) {
               for(int i = 1;i<m && curr!=null;i++) {
                     curr = curr.next;
               }
               if(curr==null) return;
               Node t = curr.next;
               for(int i= 1; i<=n && t!=null;i++) {
                   t = t.next;
               }
               curr.next = t;
               curr = t;
           }
        }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();

            ll.addLast(1);
            ll.addLast(2);          // add last
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.addLast(6);
            ll.addLast(7);
            ll.addLast(8);
            ll.addLast(9);
            ll.addLast(10);
            int m = 2, n = 2;
            ll.deleteMN(m,n);
            ll.print();
        }
    }
}
