public class Queue_using_array {
    public static void main(String[] args) {
        Queue s = new Queue(5);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }
    }
    public static class Queue {
        static int[] arr;
        static int rear;
        static int size;

        Queue(int n ) {
            arr = new int[n];
            rear = -1;
            size = n;
        }
        // is empty
        static boolean isEmpty() {
            return rear == -1;
        }
        // remove
        static int remove() {
            if(isEmpty()) System.out.println("empty queue");
            int front = arr[0];
            for(int i = 0;i<rear;i++) {
                arr[i] = arr[i+1];
            }
            rear = rear -1;
            return front;
        }
        // add data
        static void add(int data) {
            if(rear == size-1) System.out.println("queue is full");
            rear = rear +1;
            arr[rear] = data;
        }

        // peek element
        static int peek() {
            return arr[0];
        }
    }
}
