package Day013.Excepsions_37_38_39_40;

public class Exception_3_CheckedUnChecked {
    /**
     * В джаве существует 2 типа исключений
     * 1 - Checked Exception(Compile Time Exception) - исключания который нужно обрабатывать/ исключительные случаи в
     * работе программы
     *
     * 2 - UnChecked Exception(Runtime Exception) - ошибки в работе программы которые можно но не нужно обрабатывать
     * потому что их надо устранять
     */
    public static void main(String[] args) {
        //int i = 1/0;// - делить на ноль нельзя
        String x = null;
        //x.isEmpty(); // - null это ничего, а методы для ничего вызывать нельзя
        int[] y = new int[3];
        // System.out.println(y[5]); - массив вмещает в себя только 3 обьекта

        try {
            int[] b = new int[3];
            System.out.println(b[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Вы вышли за пределы массива"); // - приклад обработки UnChecked исключения(ошибки)
        }
    }
}
