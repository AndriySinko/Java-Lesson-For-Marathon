package Day8;

public class ObjectsAndToString_25 {
    /**
     * Object() - класс который создается при создании класса, что означает что созданый класс является обьектом класса Object()
     * а обьекты нашего созданного класа по сути тоже являются обьектами класса Object().
     *
     * При создании класса рунашего нового обьекта класса, класс Object() генерирует для каждого свой хэш(уникальный) код
     *  с помощью toString() в котором  и хранится єтот код
     * Для изменения значения строки, обьекта класса нужно изменить тело метода toString()
     *
     */
    public static void main(String[] args) {
        Animals animal = new Animals(new String[]{"Tiger","Lion","Monkey"}, new int[]{7,10,4});
        System.out.println(animal); // =System.out.println(animal.toString());
    }
}
class Animals{
    private String[] name;
    private int[] age;
    public Animals(String[] name, int[] age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name[0]+" "+age[0]+" "+name[1]+" "+age[1]+" "+name[2]+" "+age[2];


    }
}