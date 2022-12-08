public class Is_ll_Palindrome {
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

             // slow-fast approach
        public Node findMiddle() {
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next!=null) {
                slow= slow.next;       // +1
                fast = fast.next.next;     // +2
            }
            return slow;               // middle
        }
        public boolean isPalindrome() {
            if(head==null || head.next==null) {
                return true;
            }
            // step - 1 find middle
            Node midNode = findMiddle();
            // step -2 reverse the right half
            Node prev = null;
            Node curr = midNode;
            Node next;
            while(curr!=null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev;       // head for right half
            Node left = head;        // head for left half

            // step - 3 check if right half equals left half
            while(right!=null) {
                if(left.data!=right.data) return false;
                right = right.next;
                left = left.next;
            }
            return true;
        }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();

            ll.addLast(2);          // add last
            ll.addLast(3);
            ll.addLast(3);
            ll.addLast(2);
            ll.print();
            System.out.println(ll.isPalindrome());
        }
    }
}
