public class Intersection_Y_point {
    public static class LinkedList {
        public static class Node {            // blueprint of a node
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public Node getIntersectionPoint(Node head1, Node head2) {
            while (head2 != null) {
                Node temp = head1;
                while (temp != null) {
                    if (temp == head2) {
                        return head2;
                    }
                    temp = temp.next;
                }
                head2 = head2.next;
            }
            return null;
        }


        public static void main(String[] args) {
            LinkedList ll = new LinkedList();

            Node head1, head2;
            head1 = new Node(10);
            head2 = new Node(3);
            Node newNode = new Node(6);
            head2.next = newNode;
            newNode = new Node(9);
            head2.next.next = newNode;
            newNode = new Node(15);
            head1.next = newNode;
            head2.next.next.next = newNode;
            newNode = new Node(30);
            head1.next.next = newNode;
            head1.next.next.next = null;

            Node intersection= ll.getIntersectionPoint(head1,head2);

            if(intersection==null) {
                System.out.println("no intersection point exist");
            }
            else {
                System.out.println("Intersection point is: "+intersection.data);
            }

        }
    }
}
