package Day013.Excepsions_37_38_39_40;

import java.util.Scanner;

public class Exception_2_2 {
    public static void main(String[] args) throws TestException_2_2 {
        System.out.println("Введи 10");
        Scanner scanner = new Scanner(System.in);
        while (true){
            int i = Integer.parseInt(scanner.nextLine());
            if(i != 10){
                throw  new TestException_2_2("Ты не ввел 10");
            }
        }
    }
}
