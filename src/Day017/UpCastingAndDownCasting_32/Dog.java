package UpCastingAndDownCasting_32;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void sound(){
        System.out.println("Dog is sounding");
    }
    public  void sleep(){
        System.out.println("Dog is sleeping..");
    }
}
