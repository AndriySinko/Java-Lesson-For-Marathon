package Day8;

public class StringBuilder_23_24 {
    /**
     *
     * Существует такое понятие как Utble и UnUtble
     * что ознает - изменяется и не изменяется.
     *
     * Класс String относится к группе UnUtble и заданное значание строки не изменяется
     *
     * String a = "Hello"
     * a.toUpperCase (изменение маленьки букв на большие) это не сработает так как строка а является неизменной
     * но если переопредилить а
     * a = a.toUpperCase случится возвразение методом новой строки на которую будет ссілатся обьект класса а
     *
     */
    public static void main(String[] args) {
    String a = "Hello ";
    String b = "my name is ";
    String c = "Andrew";
    String getAll = a+b+c;
        System.out.println(getAll);
        System.out.println();
        //Тут случилось так что новый обьект класса getAll распознает совмезение двух строк a+b и создает 3 строку
        // "Hello my name is" потом случатеся то самое сопоставление уже этой 3 строки "Hello my name is" с 4 строкой с
        // и создает 5 строку в которую входит значение всех 3 строк
        // Но это занимает много места и памяти на выделение новых строк и их сопоставление, и вместо это лучше использовать

        StringBuilder constucror = new StringBuilder("Bye ");
        System.out.println(constucror.toString());
        System.out.println();

        constucror.append("See ").append("you ").append("soon");
        System.out.println(constucror.toString());
        //StringBuilder точной такой класс как и String но только он уже Utble и может додавать, изменять свое значение

        System.out.printf("%-10s my %8s is %s. I have %4.3f year old \n ", "Hello","name","Andrew",15.3227454);
    }
}
