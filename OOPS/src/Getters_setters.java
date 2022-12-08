public class Getters_setters {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal bird = new Animal();
        Animal cat = new Animal();
        dog.setColor("black");                  //to modify value
        System.out.println(dog.getColor());     //to return value
        bird.setColor("blue");
        System.out.println(bird.getColor());
        cat.setColor("white");
        System.out.println(cat.getColor());     // can't access like cat.color()
    }
}
class Animal {
    private String color;
    //getters
    String getColor() {
        return color;
    }
    //setters
    void setColor(String color)  {
        this.color = color;
    }
}
