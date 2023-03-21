package Serealization_45_46_47;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("notebook.bin"))) {


            Asus asus = (Asus) ois.readObject();
            Hp hp = (Hp) ois.readObject();

            Lenovo[] lenovo = (Lenovo[]) ois.readObject();

            System.out.println(asus);
            System.out.println(hp);

            System.out.println(Arrays.toString(lenovo));
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
