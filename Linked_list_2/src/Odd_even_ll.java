public class Odd_even_ll {
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
        public void oddEvenSort() {
            Node temp = head;
            Node even = null;
            Node odd = null;
            Node oddHead = null;
            while(temp!=null) {
                if(temp.data%2==0) {
                    if(even==null)  {
                        even = temp;
                        head = even;
                    }
                    else {
                        even.next = temp;
                        even = even.next;
                    }
                }
                else {
                    if(odd==null)  {
                        odd = temp;
                        oddHead = temp;
                    }
                    else {
                        odd.next = temp;
                        odd = odd.next;
                    }
                }
                temp = temp.next;
            }
            if(even!=null && odd!=null) {
                even.next = oddHead;
                odd.next = null;
            }
        }
        public static void main(String[] args) {
            LinkedList ll = new LinkedList();


            ll.addLast(90);
            ll.addLast(10);
            ll.addLast(12);
            ll.addLast(40);
            ll.addLast(60);
            ll.print();
            ll.oddEvenSort();
            ll.print();
        }
    }
}
