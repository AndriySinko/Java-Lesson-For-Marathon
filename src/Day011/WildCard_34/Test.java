package Day011.WildCard_34;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(111));
        carList.add(new Car(222));

        List<Audi> carAudi = new ArrayList<>();
        carAudi.add(new Audi(8,"RS Q","Audi"));
        carAudi.add(new Audi(6,"S","Audi"));

        List<Skoda> carSkoda = new ArrayList<>();
        carSkoda.add(new Skoda(7,"Octavia A","Skoda"));
        carSkoda.add(new Skoda(0,"Fabia","Skoda"));

        showCar(carList);
        System.out.println();
        showCar(carAudi);
        System.out.println();
        showCar(carSkoda);
    }
    public static void showCar(List<? extends Car>list){
        for (Car car:list) {
            car.drive();
        }
    }
}
