public class Type_promotion {
    public static void main(String[] args) {

        //java promote byte,char,short -> int automatically in expression

        //Example - 1:
        char a = 'a';
        short b = 50;
        System.out.println(a+b);   //converted into int type

        //if one operand is long,double,float then whole expression convert into long,double,float

        //Example - 1:
        int c = 10;
        double d = 56.997;
        char e = 'e';
        float f = (float)(c+d+e);               //c,d,e get converted into double
        System.out.println(f);

        //Example - 2:
        int g = 11;
        float h = 678.98f;
        char i = 'a';
        double j = g+h+i;
        System.out.println(j);


    }
}
