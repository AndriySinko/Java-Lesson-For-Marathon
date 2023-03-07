package Day9.Inheritance_26;

public class Developer extends Human {
    String work;
    int yearsOfWork;
    public void setWork(String work){
        this.work = work;
    }
    public void setYears(int yearsOfWork){
        this.yearsOfWork = yearsOfWork;
    }
    public void working(){
        System.out.println("I am working "+work+" "+yearsOfWork+" years.");
    }


}
