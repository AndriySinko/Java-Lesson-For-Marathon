package Day9.Inheritance_26;

public class IndustryDeveloping extends Developer {
    String industryProgramming;
    String programmingLanguage;
    String whatKindOfWork;
    int howTimeIWorkInDay;
    public void setIndustryProgramming(String industryProgramming){
        this.industryProgramming = industryProgramming;
    }
    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }
    public void setWhatKindOfWork(String whatKindOfWork){
        this.whatKindOfWork = whatKindOfWork;
    }
    public  void setHowTimeIWorkInDay(int howTimeIWorkInDay){
        this.howTimeIWorkInDay = howTimeIWorkInDay;
    }

    public void sayWhatDoWork(){
        System.out.println("My industry in"+work+" - "+industryProgramming+". I am writing in "+programmingLanguage
                +". I am doing "+whatKindOfWork+" "+howTimeIWorkInDay+" hours a day.");
    }
}
