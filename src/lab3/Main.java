package lab3;

import lab5.GUI;

public class Main {
    public static void main(String[] args) {
        if (args.length == 1) {
            try {
                int count = Integer.parseInt(args[0]);
                if (count > 0) {
                    System.out.println("Количество повторений: " + count);
                    System.out.println("");
                    GUI.textArea.append("Количество повторений: " + count + "\n" + "\n");

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
                    GUI.textArea.append("Введите положительное число!" + "\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите число, а не строку!");
                GUI.textArea.append("Введите число!" + "\n");
            }
        } else {
            System.out.println("Некорректное количество параметров!");
            GUI.textArea.append("Некорректное количество параметров!" + "\n");
        }
    }
}