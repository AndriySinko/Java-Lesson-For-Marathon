package Day013.Excepsions_37_38_39_40;

import java.io.IOError;

public class Exception_4 {
    public static void main(String[] args){ //throws ArrayIndexOutOfBoundsException, IllegalAccessError, IOError
        //Если есть много Exception так тогда и throws должно быть столько же
        try {
            run();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("sadasd");
        }catch (IOError b){
            System.out.println("asdad"); // -  catch может быть сколько угодно
        }catch (NegativeArraySizeException | IllegalAccessError e ){
            e.printStackTrace(); // - в одном catch может быть хоть-сколько исключений
        }

        try {
            run();
        }catch (Exception e){
            System.out.println("asdsad"); // - можно на место всех исключений испотльзовать их класса родителя, в которого
            // входят все виды исключений и поэтому писать после него еще что-то смысла нету
        }//catch (IOException b){
           // System.out.println("adsd");
        //}
    }
    public static void run() throws ArrayIndexOutOfBoundsException, IllegalAccessError, IOError, NegativeArraySizeException {
        // В методы можно писать сколько угодно Exception
    }
}
