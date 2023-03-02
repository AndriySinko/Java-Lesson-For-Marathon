package Day2;

import java.util.Scanner;

public class InputScanner_7 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите 1 число");
            int x = scanner.nextInt();
            System.out.println("Введите 2 число");
            int y = scanner.nextInt();
            if(x<=y){
                for(int i = x;x<=y;x++){
                    System.out.println("Числа вашого циклу - "+x+", до заданого вами максимального числа - "+y);
                }
            } else if (x>=y) {
                for(int i = x;x>=y;x--){
                    System.out.println("Числа вашого циклу - "+x+", до заданого вами мінімального числа - "+y);
                }
            }
        }
    }

