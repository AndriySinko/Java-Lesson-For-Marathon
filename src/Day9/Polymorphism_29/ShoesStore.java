package Day9.Polymorphism_29;

public class ShoesStore extends ShoppingCenter {
    String soldShoes;
    public void setSoldShoes(String soldShoes){
        this.soldShoes = soldShoes;
    }
    public void showINfoOfStore(){
        System.out.println("That a shoes store - "+nameCenter+", people work in this - "+numberOfPeople);
    }
    public void soldProduct(){
        System.out.println("We are sale "+product+". That "+product+"s - "+soldShoes);
    }
    public void showInfoOfStore(){
        System.out.println("Name store - "+nameCenter+", people works in this shop - "+numberOfPeople);
    }
}
