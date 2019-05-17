package lab2;

import lab5.GUI;

class B extends A implements I2 {
    void b1() {
        System.out.println("My Class B, I am b1()");
        GUI.textArea.append("My Class B, I am b1()" + "\n");
    }
}
