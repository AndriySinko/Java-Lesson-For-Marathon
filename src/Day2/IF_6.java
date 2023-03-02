package Day2;

public class IF_6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        if (b < a) {
            System.out.println("1");
        } else if (a + b < a) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
        System.out.println(" ");
        int x = 10;
        int y = 30;
        for (int i = 0; i <= y + x; i = i + 2) {
            x--;
            int z = y + x;
            System.out.print(i + " " + z);
            if (i == z) {
                System.out.println(" - Yes that true, i = z");
            } else if (i < z) {
                System.out.println(" - No, that false i<z");
            } else {
                System.out.println(" - i>z");
            }
        }
    }
}




