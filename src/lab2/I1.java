package lab2;

public interface I1 {
    default void i1() {
        System.out.println("I belong " + this.getClass().getSimpleName() + ", I am i1()");
    }
}
