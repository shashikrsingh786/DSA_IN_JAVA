import java.util.ArrayList;

public class Stacks_using_al {
    static class Stacks {
        ArrayList<Integer> al = new ArrayList<>();
        public boolean isEmpty() {
            return al.size() ==0;
        }
        public void push(int data) {
            al.add(data);
        }
        public int pop() {
            if(isEmpty()) { return -1;}
             int top = al.get(al.size()-1);
            return al.remove(al.size()-1);
        }
        public int peek() {
            if(isEmpty()) return -1;
            return al.get(al.size()-1);
        }
    }
    public static void main(String[] args) {
        Stacks sc = new Stacks();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        while(!sc.isEmpty()) {
            System.out.println(sc.peek());
            sc.pop();
        }
    }
}
