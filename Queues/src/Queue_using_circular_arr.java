public class Queue_using_circular_arr {
    public static void main(String[] args) {
        Queue s = new Queue(5);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }
    }
    public static class Queue {
        static int[] arr;
        static int rear;
        static int size;
        static int front;

        Queue(int n ) {
            arr = new int[n];
            rear = -1;
            front = -1;
            size = n;
        }
        // is empty
        static boolean isEmpty() {
            return rear == -1 && front == -1;
        }
        // remove
        static boolean isFull() {
            return (rear+1)%size==front;
        }
        static int remove() {
            if(isEmpty()) System.out.println("empty queue");
            int result = arr[front];
            // last element delete
            if(rear==front) rear=front=-1;
            else{
                front = (front+1)%size;
            }
            return result;
        }
        // add data
        static void add(int data) {
            if(isFull()) System.out.println("queue is full");
            if(front==-1) front = 0;
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        // peek element
        static int peek() {
            return arr[front];
        }
    }
}
