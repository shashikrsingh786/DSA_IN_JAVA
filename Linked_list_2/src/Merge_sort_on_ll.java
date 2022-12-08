public class Merge_sort_on_ll {
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
        public Node mergeSort(Node head) {
            //base case
            if(head == null || head.next==null) {
                return head;
            }

            //find middle node
            Node mid = findMiddle(head);

            //merge sort for left half and right half
            Node rightHead = mid.next;
            mid.next = null;
            Node newLeft = mergeSort(head);
            Node newRight = mergeSort(rightHead);

            // return merge
            return merge(newLeft,newRight);
        }

        public Node findMiddle(Node head) {
            Node slow = head;
            Node fast = head.next;
            while(fast!=null && fast.next!=null) {
                slow= slow.next;       // +1
                fast = fast.next.next;     // +2
            }
            return slow;               // middle
        }

        public Node merge(Node head1, Node head2) {
            Node mergedLL = new Node(-1);
            Node temp = mergedLL;
            while(head1!=null && head2!=null) {
                if(head1.data<=head2.data) {
                    temp.next = head1;
                    head1 = head1.next;
                }
                else {
                    temp.next = head2;
                    head2 = head2.next;
                }
                temp = temp.next;
            }
            while(head1!=null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while(head2!=null) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            return mergedLL.next;
        }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();

            ll.addLast(4);          // add last
            ll.addLast(5);
            ll.addLast(2);
            ll.addLast(3);
            ll.addLast(1);
            ll.print();
            ll.head = ll.mergeSort(ll.head);
            ll.print();
        }
    }
}
