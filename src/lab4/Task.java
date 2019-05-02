package lab4;

import java.util.ArrayList;
import java.util.Random;

public class Task {
    private static ArrayList<Student> students;
    private static int numberOfStudents;
    private static Random random = new Random();

    public Task(ArrayList<Student> students, int numberOfStudents) {

        Task.students = students;
        Task.numberOfStudents = numberOfStudents;
    }

    public static void invateStudent() {
        int index = random.nextInt(numberOfStudents);
        Task.students.get(index).run();
        Task.students.remove(index);
    }

    public static int getNumberOfStudents() {
        return Task.numberOfStudents;
    }

    public static void decrementStudents() {
        Task.numberOfStudents--;
    }


}
