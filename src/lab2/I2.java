package lab2;

public interface I2 extends I1 {
    default void i2(){
        System.out.println("My Interface I2, I am i2()");
    }
}
