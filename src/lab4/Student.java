package lab4;

import lab5.GUI;

public class Student extends Thread {
    private final int number;

    Student(int number) {
        super("Студент");
        this.number = number;
    }

    public void run() {

        synchronized (this) {

            System.out.println(getName() + " " + number);
            GUI.textArea.append(getName() + " " + number + "\n");
            Task.decrementStudents();

            this.notify();

        }
    }
}
