package lab4;

public class Student extends Thread {
    private final int number;

    Student(int number) {
        super("Студент");
        this.number = number;
    }

    public void run() {

        synchronized (this) {

            System.out.println(getName() + " " + number);
            Task.decrementStudents();
            //GUI.textArea.append(Thread.currentThread().getName() + " " + number + " count: " + task.getCount() + "\n");

            this.notify();

        }
    }
}
