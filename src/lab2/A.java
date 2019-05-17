package lab2;

import lab5.GUI;

class A implements I1 {
    void a1() {
        System.out.println("My Class A, I am a1()");
        GUI.textArea.append("My Class A, I am a1()" + "\n");
    }
}
