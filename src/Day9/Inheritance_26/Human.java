package Day9.Inheritance_26;

public class Human {
    String name;
    int age;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void sayNameAndAge(){
        System.out.println("Hello, my name is "+name+", i have "+age+" years old.");
    }
    }

