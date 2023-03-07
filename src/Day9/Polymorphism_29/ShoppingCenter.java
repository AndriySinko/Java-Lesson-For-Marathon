package Day9.Polymorphism_29;

public class ShoppingCenter implements ShopCenterInfo {
    String product;
     String nameCenter;
     int numberOfPeople;
    public void setNameCenter(String nameCenter){
        this.nameCenter = nameCenter;
    }
    public void setNumberOfPeople(int numberOfPeople){
        this.numberOfPeople = numberOfPeople;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public void showInfoOfStore(){
        System.out.println("Name center - "+nameCenter+", people working - "+numberOfPeople);
    }
    public void soldProduct(){
        System.out.println("We are sale - "+product);
    }
}
