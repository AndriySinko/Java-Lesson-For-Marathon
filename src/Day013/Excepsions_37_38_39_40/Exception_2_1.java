package Day013.Excepsions_37_38_39_40;

import java.io.IOException;
import java.util.Scanner;

public class Exception_2_1  {
    public static void main(String[] args) throws IOException {
        System.out.println("Не вводи 0");
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());

            if (x == 0){
                throw new IOException();
            }
        }
    }
}
