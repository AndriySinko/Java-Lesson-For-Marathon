package Day011.WildCard_34;

public class Skoda extends Car{
    private String name;
    private String model;
    public Skoda(int id, String model, String name){
        super(id);
        this.model = model;
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println(name+" "+model+id+" is driving....");

    }
}
