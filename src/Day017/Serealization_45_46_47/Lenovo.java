package Serealization_45_46_47;

import java.io.Serializable;

public class Lenovo implements Serializable {
    private String brand;
    private String modelName;
    private int idName;
    public Lenovo(String brand, String modelName, int idName){
        this.brand = brand;
        this.modelName = modelName;
        this.idName = idName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }
    public String getModelName(){
        return  modelName;
    }
    public int getIdName() {
        return idName;
    }
    public String toString(){
        return brand + " " + modelName + " " + idName;
    }
}
