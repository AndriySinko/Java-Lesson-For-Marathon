package Day5;

public class ClassesObjectsMethodes_14_15_16_17 {
    /**
     * =========================================  Lesson - 14  ============================================
     *Клас public може бути лише 1, і має сооствествувати назві файлу .java
     * Класів ми можемо создати скільки захочемо
     *
     * Класс - якийсь шаблон, группа яка носить в собі общее значення для всього, напр(Класс машини)
     * Класс може мати обьекти, - часть яка належить до цього классу напр(Шкода, Ауди, Фольксваген)
     *
     * У класса можуть бути:
     * 1. Данні, характеристика(Марка, рік, комплектація) - поля
     * 2.Действія які можна совершати(їхати, тормозити)
     *
     * =========================================  Lesson - 15  ============================================
     *
     * void - метод который ничего не значит он как пустота, только выполняет тело метода;
     *
     * //=========================================  Lesson - 16  ============================================
     *
     * return - возвращает только данные того метода в которм находится и после него уже ничего не выполняется
     */
    public static void main(String[] args) {
        //=========================================  Lesson - 14  ============================================
        Car1 car1 = new Car1();
        car1.brand = "Skoda";
        car1.model = "octavia a7";
        car1.yearOfIssue = 2016;
        System.out.println("В данное время ваша машина это - "+car1.brand+" "+car1.model+" ,выпущеная в "+car1.yearOfIssue+".");

        Car1 car2 = new Car1();
        car2.brand = "Audi";
        car2.model = "Q8";
        car2.yearOfIssue = 2022;
        System.out.println("Но вы хотите купить "+car2.brand+" "+car2.model+car2.yearOfIssue+" года.");
        System.out.println();

        //=========================================  Lesson - 15  ============================================

        car1.engine = 1.9;
        car1.engineName = "Дизель";
        car1.accelereationSpeed = 9.2;
        car1.fuelConsuption = 7;
        car1.characteristics();

        car2.engine = 3.0;
        car2.engineName = "Бензин";
        car2.accelereationSpeed = 4.2;
        car2.fuelConsuption = 13;
        car2.characteristics();
        System.out.println();

        //=========================================  Lesson - 16  ============================================

        int guarantee = car1.howTimeToTO();
        int guarantee2 = car2.howTimeToTO();

        if(guarantee<2023){
            System.out.println("Гарантия на ТО действoвала до "+guarantee);
        } else if (guarantee==2023){
            System.out.println("Гарантия заканчится в конце "+guarantee);
        }else {
            System.out.println("Гарантия действует до " + guarantee + " года");
        }
        if(guarantee2<2023){
            System.out.println("Гарантия на ТО действoвала до "+guarantee2);
        } else if (guarantee2==2023){
            System.out.println("Гарантия заканчится в конце "+guarantee2);
        }else {
            System.out.println("Гарантия действует до "+guarantee2+" года");
        }
        System.out.println();

        //=========================================  Lesson - 17  ============================================

        Car1 car3 = new Car1();
        Car1 car4 = new Car1();
        String s4 = "Pegout";
        String a4 = "508SE";
        int i4 = 2021;
        car3.setCarModelYear("Volkswagen","Passat B5",2020);
        car4.setCarModelYear(s4,a4,i4);
        car3.newCar();
        car4.newCar();

    }
}

class Car1{
    //============================================14============================================
    String brand;
    String model;
    int yearOfIssue;

    //============================================15============================================
    double engine;
    String engineName;
    double accelereationSpeed;
    int fuelConsuption;
    void characteristics(){
        System.out.println(brand+" "+model+" "+yearOfIssue+" данное авто имеет мотор "+engine+" "+engineName+". Разгон от 0-100 за "+accelereationSpeed+"c, расход топлива становит "+fuelConsuption+" литров на 100км");
    }
    //============================================16============================================
    int howTimeToTO(){
        int howTO = yearOfIssue+5;
        return howTO;
    }
    //============================================17============================================
    void setCarModelYear(String carname, String modelname, int yearnumber){
        brand = carname;
        model = modelname;
        yearOfIssue = yearnumber;
    }
    void newCar(){
        System.out.println("Еще хорошая машина - "+brand+" "+model+" "+yearOfIssue);
    }
    }
