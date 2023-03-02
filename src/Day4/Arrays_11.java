package Day4;

public class Arrays_11 {
    public static void main(String[] args) {
        int x = 5;   // примитивный тип данных == данные внутри обекта [10]
        int[] array = new int[10];  // ссылочный тип данных == обьект ссылается на данные  / array --> [10]
        for (int i = 0;i< array.length;i++){
            array[i] = i*7;
            System.out.println("Ваши данные целочисленного массива - "+array[i]);
        }
        System.out.println(" ");
        for (int i = 0;i< array.length;i++){
            if(array[i]%2==0){
                continue;
            }
            System.out.println("Ваши данные непарные целочисленного массива - "+array[i]);
        }
        System.out.println(" ");
        for (int i = 0;i< array.length;i++){
            if(array[i]%2==1){
                continue;
            }
            System.out.println("Ваши данные парные целочисленного массива - "+array[i]);
        }
        System.out.println(" ");
        int[] value = {10,15,20,25,30};
        for (int i = 0; i< value.length;i++){
            System.out.println(value[i]);
        }
    }
}
