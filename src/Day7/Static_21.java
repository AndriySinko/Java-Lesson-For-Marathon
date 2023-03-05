package Day7;

public class Static_21 {
    /**
     *
     * static - метод класса который относится ко всему классу и всем обьектам которые в нем находятся, если его
     * сменить 1 раз и после него будет идти обьект класса так они примкт его значение. Этот метод относится только
     * к классу а не к обьекстам класса, как и методы обьектов класса не относятся к самому классу.
     *
     *  Методу static нельзя присваить значение которое может изменятся, оно должно быть стытическим для всего.
     */
    public static void main(String[] args) {
    Fruites fruit1 = new Fruites("Banan", 3);
    Fruites fruit2 = new Fruites("Apple", 5);
    Fruites.freshness = "Fresh";
    fruit1.getAllFruites();
    fruit2.getAllFruites();
        Fruites fruit3 = new Fruites("Pineapple", 4);
        Fruites fruit4 = new Fruites("Watermelon", 2);
    Fruites.freshness = "Medium fresh";
        fruit3.getAllFruites();
        fruit4.getAllFruites();
    Fruites fruit5 = new Fruites("Cherry", 10);
    Fruites.freshness = "Rot";
        fruit5.getAllFruites();
        System.out.println();
        fruit1.getAllFruites1();
        fruit2.getAllFruites1();
        fruit3.getAllFruites1();
        fruit4.getAllFruites1();
        fruit5.getAllFruites1();

    }
}
class Fruites{

  private String nameFruit;
 private int valuesFruit;
    public Fruites(String nameFruit, int valuesFruit){
        this.nameFruit = nameFruit;
        this.valuesFruit = valuesFruit;
    }
    public static String freshness;
    public void getAllFruites(){
        System.out.println(nameFruit+" "+valuesFruit+" "+freshness);
        }
    public void getAllFruites1(){
        for(int i=0;i<3;i++){
            System.out.println(nameFruit+" "+valuesFruit+" ");
    }
        freshness = "medium";
        System.out.println(freshness);
    }

}