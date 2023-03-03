package Day5;

import java.util.Scanner;

public class IncapsulationSettersAndGetters_18 {
    /**
     * Инкапсуляция - обьеденение данных, методов, переменных, строк в одно целое(в одну упаковку)
     *
     * В инкапсуляции переменные класса будут скрыты от других классов и доступ к ним может быть получен
     * только с помощью метода их текущего класса. Пользователт не обязательно знать как все работает изнутри, ему
     * нужно только пользоватся уже готовым. Это позволяет контролтровать данные на вход, или менять при нужде
     * переменные или строки
     *
     *
     */
    public static void main(String[] args) {
        Vagatebles vagatebles = new Vagatebles();
        System.out.println(vagatebles.getOvocie()+"\n"+vagatebles.getWeightOvocie());
    }
}

class Vagatebles {
    private Scanner scanner = new Scanner(System.in);
    private String ovocie = new String();
    private int weightOvocie;

    public Vagatebles() {
        System.out.println("Здраствуйте, вы в продуктовом магазине, назовите что вам нужно.");
        setOvocie();

    }

    private void whatWeightYouNeed() {
        System.out.println("Сколько килограм?");
    }


    private void setOvocie() {
        ovocie = scanner.nextLine();
        if (ovocie.isEmpty()) {
            System.out.println("Некорректное значение");
        } else {
            whatWeightYouNeed();
            setWeightOvocie();
        }
    }

    public String getOvocie() {
        return ovocie;
    }

    private void setWeightOvocie() {
        weightOvocie = scanner.nextInt();
        if (weightOvocie < 0) {
            System.out.println("Некорректное значение");
        }else {
            result();
        }
    }

    public int getWeightOvocie() {
        return weightOvocie;
    }

    private String result() {
        return "Вот ваш товар: \n" + getOvocie() +" \n"+ getWeightOvocie();
    }
}