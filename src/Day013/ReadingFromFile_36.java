package Day013;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile_36 {
    public static void main(String[] args) throws FileNotFoundException {
        String slash = File.separator;
        String link = "C:" + slash + "Users" + slash + "Андрiй" + slash + "OneDrive" + slash + "Робочий стіл" +slash +
                "ReadingFromFileJava.txt";
        File file = new File(link);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
         System.out.println(scanner.nextLine());
        }
        scanner.close();
        System.out.println();

        File file1 = new File("ReadingFromFile1");
        Scanner scanner1 = new Scanner(file1);
        String line = scanner1.nextLine();
        String[] numbersOfStrings = line.split(" ");
        int[] numbers = new int[5];
        int x = 0;
        for (String number : numbersOfStrings){
            numbers[x++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
        scanner1.close();
    }
}
