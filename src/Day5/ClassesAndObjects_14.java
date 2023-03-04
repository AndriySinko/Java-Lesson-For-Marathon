package Day5;

public class ClassesAndObjects_14 {
    /**
     * Клас public може бути лише 1, і має сооствествувати назві файлу .java
     * Класів ми можемо создати скільки захочемо
     * <p>
     * Класс - якийсь шаблон, группа яка носить в собі общее значення для всього, напр(Класс машини)
     * Класс може мати обьекти, - часть яка належить до цього классу напр(Шкода, Ауди, Фольксваген)
     * <p>
     * У класса можуть бути:
     * 1. Данні, характеристика(Марка, рік, комплектація) - поля
     * 2.Действія які можна совершати(їхати, тормозити)
     */
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.brand = "Skoda";
        car1.model = "octavia a7";
        car1.yearOfIssue = 2016;
        System.out.println("В данное время ваша машина это - " + car1.brand + " " + car1.model + " ,выпущеная в " + car1.yearOfIssue + ".");

        Car1 car2 = new Car1();
        car2.brand = "Audi";
        car2.model = "Q8";
        car2.yearOfIssue = 2022;
        System.out.println("Но вы хотите купить " + car2.brand + " " + car2.model + car2.yearOfIssue + " года.");
        System.out.println();
    }
}

class Car1 {
    String brand;
    String model;
    int yearOfIssue;
}
