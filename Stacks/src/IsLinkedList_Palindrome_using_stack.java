import java.util.Stack;

public class IsLinkedList_Palindrome_using_stack {
    public static void main(String[] args) {
        Node head = new Node('a');
        head.next =  new Node('b');
        head.next.next = new Node('c');
        head.next.next.next = new Node('d');
        head.next.next.next.next = new Node('b');
        head.next.next.next.next.next = new Node('a');
        System.out.println(isPalindrome(head));
    }
    public static class Node {
        char data;
        Node next;
        Node(char data) {
           this.data = data;
           this.next = null;
        }
    }
    public static boolean isPalindrome(Node head) {
        Stack<Character> s  = new Stack<>();
        Node temp = head;
        while(temp!=null) {
            s.push(temp.data);
            temp = temp.next;
        }
        while(head!=null) {
            char c = s.pop();
            if(!(head.data==c))  {
                return false;
            }
                head = head.next;
        }
        return true;
    }
}
