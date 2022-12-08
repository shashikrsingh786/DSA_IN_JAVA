public class Multiple_inheritance {
    public static void main(String[] args) {
        Bear b1 = new Bear();
        b1.eatNonVeg();
        b1.eatVeg();
    }
}

interface Herbivorous {
    void eatVeg();
}
interface  Carnivorous {
    void eatNonVeg();
}
class Bear implements  Herbivorous,Carnivorous {
    public  void eatVeg() {
        System.out.println("eats grass");
    }
    public void eatNonVeg() {
        System.out.println("eat meat");
    }
}
