package lab2;

public interface I2 extends I1 {
    default void i2(){
        System.out.println("I belong " + this.getClass().getSimpleName() + ", I am i2()");
    }
}
