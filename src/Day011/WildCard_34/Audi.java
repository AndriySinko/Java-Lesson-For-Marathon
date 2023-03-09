package Day011.WildCard_34;

public class Audi extends Car{
    private String model;
    private String name;
    public Audi(int id, String model,String name) {
        super(id);
        this.model = model;
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println(name+" "+model+id+" is driving..");

    }
}
