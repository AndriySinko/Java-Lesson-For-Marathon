package Serealization_45_46_47;

import java.io.Serializable;
import java.util.Scanner;

public class Asus implements Serializable {

    private String brand;
    private String modelName;
    private int idName;
    public Asus(String brand, String modelName, int idName){
        this.brand = brand;
        this.modelName = modelName;
        this.idName = idName;
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
        return brand + " " + modelName + idName;
    }
}
