public class Copy_constructor {
    public static void main(String[] args) {
        People p1 = new People();
        p1.age = 23;
        p1.weight = 66;
        People p2 = new People(p1);
        System.out.println(p2.weight+" "+p2.age);


    }
}
class People {
    int age;
    int weight;
    People() {

    }

    People(People p1) {                           //copy constructor
        this.age = p1.age;
        this.weight = p1.weight;
    }
}


//copy constructor - A copy constructor in a Java class is a constructor that creates an object using
// another object of the same Java class.
