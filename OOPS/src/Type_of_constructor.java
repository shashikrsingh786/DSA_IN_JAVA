public class Type_of_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("7667");
        Student s3 = new Student(22);
    }
}
class Student {
    int rollNo;
    String id;
    Student() {
        System.out.println("my name is shashi");     //non-parameterised constructor
    }
    Student(String id) {            // parameterised constructor
        this.id = id;
    }
    Student(int rollNo) {              // parameterised constructor
        this.rollNo = rollNo;
    }
}


