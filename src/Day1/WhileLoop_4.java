package Day1;

public class WhileLoop_4 {
    public static void main(String[] args) {
        //*==, >=, <=, >, <.*//
        int a = 0;
        int b = 10;
        int x = 20;
        int y = 0;
        int c = 5;
        while (y<x+c){
            int z = x +c;
            y = y + 5;
            c++;
            System.out.println("Number 'y' = "+ y+" "+"If x+c = "+z+" If c = "+c);
        }
        System.out.println(" ");
        while(a<b){
            a++;
            b--;
            System.out.println("WhileLoop number: a-"+a+" b-"+b);
        }
    }
}
