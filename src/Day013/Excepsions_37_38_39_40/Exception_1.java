package Day013.Excepsions_37_38_39_40;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception_1 {
    /**
     *
     * При вызывание какого-то файла он должен где-то находится, обычно в классе Exception, но есои его вообще нету то
     * надо как-то задать агрумент при котором если его не сузествует вызывались какие-то действия.
     *
     * Можно это сделать 2 способами
     *
     * 1. throws FileNotFoundException команда которая в случае не нахождения фвйла выдает ошибку(Exception in thread
     * "main" java.io.FileNotFoundException: sdfsf (Не удается найти указанный файл)
     * 	at java.base/java.io.FileInputStream.open0(Native Method)
     * 	at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
     * 	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:158)
     * 	at java.base/java.util.Scanner.<init>(Scanner.java:641)
     * 	at Day013.Excepsions_37_38_39_40.Exception_1.main(Exception_1.java:20)
     * 	После этой ошибки выполение чего либо прекращается
     *
     * 2.Но если вы ъртите чтобы при ненахождении файла код продолжал свою работу нужно воспользоваться
     */

    public static void main(String[] args)  {
        File file = new File("ReadingFromFile1");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("Файл найден (после try)");
            while (scanner.hasNextLine()){
               System.out.println(scanner.nextLine());
            }
            scanner.close();
        }catch (FileNotFoundException e){
            System.out.println("Извините файл не найден");
        }
        System.out.println("После catch");
        System.out.println();
        /////////////////////////////////////////////////////////////////

        try {
            readFile();
        }catch (FileNotFoundException e){
            System.out.println("Напиши правильное имя файла");
        }
        System.out.println("После catch_2");
    }
    public static void readFile() throws FileNotFoundException{
        File file = new File("sdfds");
        Scanner scanner = new Scanner(file);
    }

}
