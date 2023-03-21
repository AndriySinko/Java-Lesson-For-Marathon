package UpCastingAndDownCasting_32;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sound();
        animal.sleep();
        System.out.println();

        Dog dog = new Dog();
        dog.eat();
        dog.sound();
        dog.sleep();
        System.out.println();

        Animal animal1 = dog; // Восходящие преобразование - собака стала животным
        animal1.sleep();
        animal1.sound();
        animal1.eat();
        System.out.println();

        // Dog dog1 = (Dog) animal;  Нисходящие преобразование - животное стало собакой
        // dog1.sleep();
        // dog1.sound();
        //dog1.eat();
    }
}
