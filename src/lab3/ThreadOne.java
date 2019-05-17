package lab3;

import lab5.GUI;

public class ThreadOne implements Runnable {
    private int count;
    private final Object monitor;
    private Task task;

    public ThreadOne(int count, Task task, Object monitor) {
        this.count = count;
        this.monitor = monitor;
        this.task = task;
    }

    public void run() {
        for (int i = 1; i <= count; i++) {
            synchronized (monitor) {
                task.increaseByTen();
                System.out.println(Thread.currentThread().getName() + " number " + task.getNumber());
                GUI.textArea.append(Thread.currentThread().getName() + " number " + task.getNumber() + "\n");
                monitor.notify();
                try {
                    if (i < count) {
                        monitor.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
