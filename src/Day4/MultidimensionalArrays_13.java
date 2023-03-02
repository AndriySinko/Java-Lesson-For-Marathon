package Day4;

public class MultidimensionalArrays_13 {
    public static void main(String[] args) {
        int[][] apples = {{1,2,3,4,5},
                          {6,7,8,9},
                          {10,11,12}};
        for (int[] x:apples){
            for (int y:x){
                System.out.print(y+" ");
            }
            System.out.println(" ");
        }
        System.out.println();

        ////////////////////////////////////////////////////

        int[][] board = new int[10][10];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = i*j;
            }

            //////////////////////////////////////////////
        }
        for(int[] a:board){
            for (int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
