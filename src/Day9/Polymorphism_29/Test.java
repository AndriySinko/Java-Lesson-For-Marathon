package Day9.Polymorphism_29;

/**
 * Полиморфизм - это возможность применения одноименных методов с одинаковыми или различными наборами параметров в
 * одном классе или в группе классов, связанных отношением наследования.
 *
 * https://vertex-academy.com/tutorials/ru/chto-takoe-polimorfizm-java
 *
 * Позднее связывание - если создать обьект класса Родетеля типа класса что его наследует, и в коассе наслнднике изменен
 * какойто метод унаследованный от родителя, то этот метод примет значение потомка. Но при этом он не может вызывать
 * методы созданные потомком.
 *
 * И нельзя создать класс Потомка типа Родителя так как он и так его наследует
 *
 * Крутая фишка полиформизма полягает в том если создать какой-то метод с какм-то названием и поместить в него класс
 * родитель то этот метод можно вызывать и в классах наследниках и название метода не изменится
 */
public class Test {
    public static void main(String[] args) {
        ShoppingCenter shop = new ShoppingCenter();
        shop.setNameCenter("Clothing&Shoes");
        shop.setNumberOfPeople(20);
        shop.setProduct("Shoe and Clothing");
        shop.showInfoOfStore();
        shop.soldProduct();
        System.out.println();


        ShoesStore shoe = new ShoesStore();
        shoe.setNameCenter("ShoesShop");
        shoe.setNumberOfPeople(5);
        shoe.setProduct("Shoe");
        shoe.setSoldShoes("Snickers, boots");
        shoe.showINfoOfStore();
        shoe.soldProduct();
        System.out.println();

        ShoppingCenter shopCenter = new ShoesStore();
        shopCenter.setNameCenter("dasad");
        shopCenter.setNumberOfPeople(15);
        shopCenter.showInfoOfStore();
        System.out.println();

        ShoppingCenter human = new ShoppingCenter();
        ShoesStore human1 = new ShoesStore();
        testInfo(human);
        testInfo(human1);
    }
    public static void testInfo(ShoppingCenter shopCenter){
        shopCenter.showInfoOfStore();
        shopCenter.soldProduct();
    }
}
