package lab4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        if (args.length == 2) {
            try {
                int numberOfTeachers = Integer.parseInt(args[0]);
                int numberOfStudents = Integer.parseInt(args[1]);

                if (numberOfStudents > 0 & numberOfTeachers > 0) {
                    System.out.println("Количество преподавателей: " + numberOfTeachers + " Количество студентов: " + numberOfStudents);

                    ArrayList<Student> arrayOfFlow2 = new ArrayList<>();

                    for (int i = 0; i < numberOfStudents; i++) {
                        arrayOfFlow2.add(new Student(i));
                    }

                    Task task = new Task(arrayOfFlow2, numberOfStudents);
                    Teacher[] arrayOfFlow = new Teacher[numberOfTeachers];

                    for (int i = 0; i < numberOfTeachers; i++) {
                        arrayOfFlow[i] = new Teacher(i == 0 ? null : arrayOfFlow[i - 1], i);
                    }
                    arrayOfFlow[0].setWait(arrayOfFlow[numberOfTeachers - 1]);

                    for (int i = numberOfTeachers - 1; i >= 0; i--) {
                        arrayOfFlow[i].start();
                    }

                } else {
                    System.out.println("Введите положительное число");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Введите число.");
            }
        } else {
            System.out.println("Неверное кол-во аргументов (Возможен только один аргумент)");
        }
    }
}
