package lab2;

import lab5.GUI;

public interface I1 {
    default void i1() {
        System.out.println("My Interface I1, I am i1()");
        GUI.textArea.append("My Interface I1, I am i1()" + "\n");
    }
}
