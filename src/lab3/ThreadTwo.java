package lab3;

import lab5.GUI;

public class ThreadTwo extends Thread {
    private int count;
    private final Object monitor;
    private Task task;

    public ThreadTwo(int count, Task task, Object monitor) {
        super("ThreadTwo");
        this.count = count;
        this.monitor = monitor;
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {
            synchronized (monitor) {
                task.increaseByThousand();
                System.out.println(Thread.currentThread().getName() + " number " + task .getNumber());
                GUI.textArea.append(Thread.currentThread().getName() + " number " + task .getNumber() + "\n");
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
