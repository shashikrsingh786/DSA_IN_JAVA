public class Order_of_constructor_call {
    public static void main(String[] args) {
        P2 ee = new P2();

     //   ss -> P1 -> P2
    }
}
abstract class SS {
    SS() {
        System.out.println("hello from ss");
    }
}

class P1 extends SS {
    P1() {
        System.out.println("hello from P1");
    }
}
class P2 extends  P1 {
    P2() {
        System.out.println("hello from P2");
    }
}
