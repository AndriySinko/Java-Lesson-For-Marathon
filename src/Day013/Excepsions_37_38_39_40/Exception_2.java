package Day013.Excepsions_37_38_39_40;

import java.io.IOException;
import java.util.Scanner;

public class Exception_2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введи 5");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int i = Integer.parseInt(scanner.nextLine());
            if (i != 5) {
                try {
                    throw new IOException();
                } catch (IOException E) {
                    System.out.println("Ошибка ввода");
                    break;
                }
            }
        }
    }
}
