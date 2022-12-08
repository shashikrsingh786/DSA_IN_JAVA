import java.util.Arrays;

public class Shallow_deep_copy {
    public static void main(String[] args) {
        class1 o1 = new class1();
        o1.marks[0] = 21;
        o1.marks[1] = 43;
        o1.marks[2] = 89;
        class1 o2 = new class1(o1);
        System.out.println(Arrays.toString(o2.marks));
        o1.marks[2] = 88;
        System.out.println(Arrays.toString(o2.marks));
    }
}
class class1 {
    int[] marks;
    class1() {
             marks = new int[3];
        System.out.println("Constructor is called");
  }
//    class1(class1 o1) {                                 //shallow copy
//        this.marks = o1.marks;
//    }

        class1(class1 o1) {
        marks = new int[3];                               //deep copy
        for(int i = 0;i< marks.length;i++) {
                this.marks[i] = o1.marks[i];
            }
        }
}
