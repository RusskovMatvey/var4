package lab1;

import lab5.GUI;

public class Main {
    public static void main(String[] args) {
        if (args.length == 3) {
            try {
                int a, b, c;
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
                c = Integer.parseInt(args[2]);

                System.out.println("Параметр а: " + a + " Параметр b: " + b + " Параметр с: " + c);
                GUI.textArea.append("Параметр а: " + a + " Параметр b: " + b + " Параметр с: " + c + "\n");

                if (a > 0 & b > 0 & c > 0) {
                    if (a + b > c & a + c > b & b + c > 0) {
                        System.out.println("Данные параметры могут быть сторонами треугольника, так как они соответсвуют аксиоме о существовании треугольника.");
                        GUI.textArea.append("Данные параметры могут быть сторонами треугольника," + "\n" + "так как они соответсвуют аксиоме о существовании треугольника." + "\n");
                    } else {
                        System.out.println("Данные параметры не могут быть сторонами треугольника, так как они не соответсвуют аксиоме о существовании треугольника.");
                        GUI.textArea.append("Данные параметры не могут быть сторонами треугольника," + "\n" + "так как они не соответсвуют аксиоме о существовании треугольника." + "\n");
                    }
                } else {
                    System.out.println("Данные параметры не могут быть сторонами треугольника, потому что некоторые параметры меньше, либо равны нулю!");
                    GUI.textArea.append("Данные параметры не могут быть сторонами треугольника," + "\n" + "потому что некоторые параметры меньше, либо равны нулю!" + "\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите чила, а не строку!");
                GUI.textArea.append("Введите чила, а не строку!" + "\n");
            }
        } else {
            System.out.println("Не верное количество аргументов!");
            GUI.textArea.append("Не верное количество аргументов!" + "\n");
        }

    }
}
