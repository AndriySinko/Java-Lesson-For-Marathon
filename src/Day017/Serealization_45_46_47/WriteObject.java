package Serealization_45_46_47;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Asus asus = new Asus("Asus", "ROG Strix G", 15);
        Hp hp = new Hp("HP", "Pavilion Gaming", 16);

        Lenovo[] lenovo = {new Lenovo("Lenovo","Legion",5),
                        new Lenovo("Lenovo","Ideapad Pro Gaming", 3)};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("notebook.bin"))){

            oos.writeObject(asus);
            oos.writeObject(hp);

            oos.writeObject(lenovo);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
