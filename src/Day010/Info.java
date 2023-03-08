package Day010;

public class Info {
    /**
     * Интерфейс - шаблон с методами, с которым подписуется так сказать контракт с помощью ключевого слова implements,
     * и ты обязан выполнить все методы кторые находятся в интерфейсе
     *
     * Интерфейс не может иметь поля, только константы и маетоды
     */
    public static void main(String[] args) {
        Builder builder1 = new Builder("Bob",40,"Builder","Work");
        Electrician electrician1 = new Electrician("Mike",30,"Electrician","Not work");
        builder1.showStatus();
        electrician1.showStatus();
        System.out.println();

        StatusHuman human1 = new Builder("Ted",24,"Programmer","Remote work");
        StatusHuman human2 = new Electrician("Rob",15,"Student","Studying");
        human1.showStatus();
        human2.showStatus();
    }
}
