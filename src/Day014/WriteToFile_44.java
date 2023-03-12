package Day014;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFile_44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("WriteToFile1");
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println(scanner.nextLine());
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Неправильное имя файла");
        }
    }
}
