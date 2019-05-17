package lab2;

import lab5.GUI;

public interface I2 extends I1 {
    default void i2(){
        System.out.println("My Interface I2, I am i2()");
        GUI.textArea.append("My Interface I2, I am i2()" + "\n");
    }
}
