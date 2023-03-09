package Day011;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Generics_33{
    public static void main(String[] args) {
        ///////////////////Java 5///////////////////////////
        List human = new ArrayList();
        human.add("Builder");
        human.add("Paramedic");
        human.add("Programmer");
        String human1 = (String) human.get(2);
        System.out.println(human1);

        /////////////////Появление Generic///////////////////
        List<Integer> years = new ArrayList<Integer>();
        years.add(1);
        years.add(2);
        years.add(3);
        Integer years1 = years.get(1);
        System.out.println(years1);

        //////////////Java 7////////////////
        List<String> books = new ArrayList<>();
        books.add("Harry Potter");
        books.add("Java Philosophy");
        books.add("Hamlet");
        String books1 = books.get(0);
        System.out.println(books1);
    }
}
