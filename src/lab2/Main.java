package lab2;

public class Main {
    public static void main(String[] args) {
        B object1 = new B();
        object1.b1();
        object1.a1();
        object1.i1();
        object1.i2();

        System.out.println("----------------------");

        I1 object2 = new B();
        ((B) object2).b1();
        ((B) object2).a1();
        object2.i1();
        ((B) object2).i2();
    }
}