package lab4;

public class Teacher extends Thread {
    private Object wait;
    private final int number;
    private int count;

    Teacher(Object wait, int number) {
        super("Преподаватель");
        this.wait = wait;
        this.number = number;
        this.count = Task.getNumberOfStudents();
    }

    void setWait(Object wait) {
        this.wait = wait;
    }

    public void run() {
        try {
            for (int i = 0; i < count; ++i) {

                if (!(number == 0 && i == 0))
                    synchronized (wait) {
                        wait.wait();
                    }

                synchronized (this) {
                    if (Task.getNumberOfStudents() > 0) {

                        System.out.print(Thread.currentThread().getName() + " " + number + " ");
                        Task.invateStudent();
                        //GUI.textArea.append(Thread.currentThread().getName() + " " + number + " count: " + task.getCount() + "\n");

                        this.notify();
                    } else {
                        this.notify();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
