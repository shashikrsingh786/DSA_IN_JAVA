public class Largest_string_lexi {
    public static void main(String[] args) {
        String[] str = {"apple","banana","Mango"};
        largest(str);
    }
    static void largest(String[] str) {
        String largest=str[0];
        for(int i =1;i<str.length;i++) {
            if(largest.compareToIgnoreCase(str[i])<0)  largest = str[i];
        }
        System.out.println(largest);
    }
}
