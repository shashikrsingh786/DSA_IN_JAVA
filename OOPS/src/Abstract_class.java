public class Abstract_class {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
    }
}
abstract class Animals {
    abstract void walk();
    void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends  Animals {
    void walk() {
        System.out.println("Horse walk");
    }
    void eat() {
        System.out.println("horse eat grams");
    }
}

