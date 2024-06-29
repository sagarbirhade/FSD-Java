package Arrays.multidimensionalarray;

import java.util.Scanner;

public class Array3D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[][][] a = new int[3][4][5];


        System.out.println("Enter elements for the 3D array (3 x 4 x 5):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.printf("Enter element for a[%d][%d][%d]: ", i, j, k);
                    a[i][j][k] = sc.nextInt();
                }
            }
        }

        // Print the array elements
        System.out.println("\nArray elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.printf("a[%d][%d][%d] = %d\n", i, j, k, a[i][j][k]);
                }
            }
        }

    }
}
