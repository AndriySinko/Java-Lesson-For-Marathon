package Day9.Inheritance_26;

public class Inheritance_26 {
    /**
     * https://vertex-academy.com/tutorials/ru/pravila-nasledovaniya-v-java/
     * https://metanit.com/java/tutorial/3.5.php
     */
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Mike");
        human.setAge(27);
        human.sayNameAndAge();
        System.out.println();

        Developer developer = new Developer();
        developer.setName("Ted");
        developer.setAge(30);
        developer.setWork("Programmer");
        developer.setYears(6);
        developer.sayNameAndAge();
        developer.working();
        System.out.println();

        IndustryDeveloping backend = new IndustryDeveloping();
        backend.setName("Stenford");
        backend.setAge(35);
        backend.setWork("Programmer");
        backend.setYears(10);
        backend.setIndustryProgramming("BackEnd Engineer");
        backend.setProgrammingLanguage("Java, C++, Kotlin");
        backend.setWhatKindOfWork("I write the technical base of the program and lead projects");
        backend.setHowTimeIWorkInDay(7);
        backend.sayNameAndAge();
        backend.working();
        backend.sayWhatDoWork();
        System.out.println();
    }
}
