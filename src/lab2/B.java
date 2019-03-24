package lab2;

class B extends A implements I2 {
    void b1() {
        System.out.println("I belong " + this.getClass().getSimpleName() + ", I am b1()");
    }
}
