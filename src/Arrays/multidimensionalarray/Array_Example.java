package Arrays.multidimensionalarray;

import java.util.Arrays;

public class Array_Example {
    public static void main(String[] args) {
        int b[][] = new int[5][5];
        b[0][0] = 12;
        b[0][1] = 30;
        b[2][2] = 40;

        for(int i = 0; i < b.length; i++){
            for(int j = 0 ; j < b.length; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < b.length; i++){
            System.out.println(Arrays.toString(b[i]));
        }

       // System.out.println(Arrays.deepToString(b));
    }
}
