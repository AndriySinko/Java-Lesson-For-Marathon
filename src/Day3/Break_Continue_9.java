package Day3;

import java.util.Scanner;

public class Break_Continue_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int z = 0;
        System.out.println("Введи число больше 0");
        int x = scanner.nextInt();
        while (true) {
            if (x > 0) {
                if (z == x) {
                    break;
                }
                System.out.println("Очередность чисел к вашему числу x:" + z);
                z++;

            }
        }
        System.out.println(" ");
        for (int b = 0; b < x; b++) {
            if (b % 2 == 0) {
                continue;
            }
            System.out.println("Ваши непарные числа - " + b);
        }
        System.out.println(" ");
        for (int c = 0; c < x; c++) {
            if (c%2==1) {
                continue;
            }
            System.out.println("Ваши парные числа - " + c);
        }
    }
}
