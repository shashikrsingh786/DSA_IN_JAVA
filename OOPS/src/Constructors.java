
public class Constructors {
    public static void main(String[] args) {
        Grade student1 = new Grade();
    }
}
class Grade {
    int marks;
    int classTeacher;
    Grade() {
        System.out.println("hi my name is student1");
    }

}

// parameter constructor
//public class Constructors {
//    public static void main(String[] args) {
//        Grade student1 = new Grade("SHashi");
//    }
//}
//
//
//class Grade {
//    int marks;
//    int classTeacher;
//    Grade(String name) {
//        System.out.println("my name is "+ name);
//    }
//
//}