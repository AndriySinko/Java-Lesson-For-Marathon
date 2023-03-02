package Day4;

public class ArraysOfStrings_ForEach_12 {
    public static void main(String[] args) {
        int[] values = new int[7];
        int x = 0;
        for (int a = 0; a< values.length;a++){
            values[a] = a*5;
        }
        for(int value:values){
            x=x*value;
            System.out.println(x);
            x++;
        }
        System.out.println();
        for (int i = 0; i< values.length;i++){
            System.out.println(values[i]);
        }
    }
}
