package Day015;

public class Lesson_30_31 {
    public static void main(String[] args) {
        double a = 123.4;
        System.out.println(a);
        float b = (float)a; // float b = af;
        System.out.println(b);
        int x = (int)b;
        System.out.println(x);
        long l = x;
        System.out.println(l);
        short s = (short) l;
        System.out.println(s);
        double q = s;
        System.out.println(q);
        System.out.println();

        int p1 = 123;
        Integer p2 = 456;
        Integer p3 = p1; // упаковка примитивного типа данных int p1
        int p4 = p2; // распаковка Класса обертки примитивного типа данных - Integer p2
        System.out.println(p1+" "+p2+" "+p3+" "+p4);

    }
}
