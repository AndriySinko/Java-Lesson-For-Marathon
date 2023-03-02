package Day1;

public class Variables_2 {
    public static void main(String[] args) {
        //*Переменные - какая-то короька котороя хранит в себе какие-то данные*//

        //*Целые*//
        byte myByte = 127; //*Числа 8Біт = -128-127*//
        short myShort =32767; //*Числа 16Біт = -32768-32768*//
        int myInt = 2147483647; //*Числа 32Біт = -2147483648-2147483647*//
        long myLong = 1234567891; //*Числа 64Біт*//

        //*Дробные(с плавающей точкой)*//
        double myDouble = 123.456; //*Числа 64Біт*//
        float myFloat = 123.456f; //*Числа 32Біт*//

        char myChar = 'a'; //*16Біт*//
        boolean myBoolean = true;

        System.out.println(myInt+" "+myByte+" "+myLong+" "+myShort+" "+myDouble+" "+myFloat);

    }
}
