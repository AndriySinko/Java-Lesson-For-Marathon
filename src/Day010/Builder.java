package Day010;

public class Builder implements StatusHuman{
    String name;
    int age;
    String work;
    String statusOfWork;
    public Builder(String name, int age, String work, String statusOfWork){
        this.age = age;
        this.name = name;
        this.work = work;
        this.statusOfWork = statusOfWork;
    }


    public void showStatus(){
        System.out.println(this.name+" "+this.age+" "+this.work+" "+this.statusOfWork);
    }
}
