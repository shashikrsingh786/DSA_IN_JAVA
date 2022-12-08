public class Merge_K_sorted_list {
    public static class LinkedList {
        public static class Node {            // blueprint of a node
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static  void print(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public static Node mergeKSortedList(Node[] arr,int end )  {
            while(end!=0) {
                int i = 0,j = end;
                while(i<j) {
                    arr[i] = sorted(arr[i],arr[j]);
                    i++;
                    j--;
                    if(i>=j) end = j;
                }
            }
            return arr[0];
        }
        public static Node sorted(Node h1, Node h2) {
            Node result;
            if(h1==null) return h2;
            else if(h2==null) return h1;
             if(h1.data<=h2.data) {
                 result = h1;
                result.next = sorted(h1.next,h2);
            }
             else {
                 result = h2;
                 result.next = sorted(h1,h2.next);
             }
             return result;
        }


        public static void main(String[] args) {
            int n = 3;
            int k = 4;
            Node[] arr = new Node[n];
            arr[0] = new Node(1);
            arr[0].next = new Node(3);
            arr[0].next.next = new Node(5);
            arr[0].next.next.next = new Node(7);
            arr[1] = new Node(2);
            arr[1].next = new Node(4);
            arr[1].next.next = new Node(6);
            arr[1].next.next.next = new Node(8);
            arr[2] = new Node(0);
            arr[2].next = new Node(9);
            arr[2].next.next = new Node(10);
            arr[2].next.next.next = new Node(11);

            Node head =  mergeKSortedList(arr,n-1);
            print(head);

        }
    }
}
