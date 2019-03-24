package lab3;

public class Main {
    public static void main(String[] args) {
        if (args.length == 1) {
            try {
                int count = Integer.parseInt(args[0]);
                if (count > 0) {
                    System.out.println("Количество повторений: " + count);
                    System.out.println("");

                    Object monitor = new Object();

                    Task task = new Task();
                    Thread thread1 = new Thread(new ThreadOne(count, task, monitor), "ThreadOne");
                    ThreadTwo thread2 = new ThreadTwo(count, task, monitor);

                    thread1.start();
                    thread2.start();
                    try {
                        thread1.join();
                        thread2.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Введите положительное число!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите число, а не строку!");
            }
        } else {
            System.out.println("Некорректное количество параметров!");
        }
    }
}