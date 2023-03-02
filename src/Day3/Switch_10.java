package Day3;

import java.util.Scanner;

public class Switch_10 {
    public static void main(String[] args) {
        //*Використовується замість кучі If, if-else, else*//
        Scanner scanner = new Scanner(System.in);
        String x = "Работаю";
        String y = "Студент";
        System.out.println("Введи свое имя");
        String name = scanner.nextLine();
        System.out.println("Введи свой возраст");
        int age = scanner.nextInt();
        int value = 25;
        switch (age) {
            case 0, 1, 2, 3, 4, 5:
                System.out.println("Тебя зовут, " + name + " ты ребенок, тебе " + age + " лет.");
                break;
            case 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17:
                if (age >= 12) {
                    System.out.println("Тебя зовут, " + name + " ты подросток, который учится в школе, тебе " + age + " лет.");
                } else {
                    System.out.println("Тебя зовут, "+name+" ты ребенок, который учится в школе,  тебе "+age+" лет.");
                }
                break;
            case 18,19,20,21,22,23,24:
                    System.out.println("Тебя зовут, "+name+" ты совершеннолетний студент, тебе "+age+" лет.");
                break;
            default:
                System.out.println("Тебя зовут, "+name+" ты совершеннолетний, и работаешь тебе "+age+" лет.");
        }
    }
}
