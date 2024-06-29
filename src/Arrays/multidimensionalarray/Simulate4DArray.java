package Arrays.multidimensionalarray;

import java.util.Scanner;

public class Simulate4DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get dimensions from the user
        System.out.print("Enter the size for dimension 1: ");
        int dim1 = sc.nextInt();
        System.out.print("Enter the size for dimension 2: ");;
        int dim2 = sc.nextInt();
        System.out.print("Enter the size for dimension 3: ");
        int dim3 = sc.nextInt();


        int[][][] a = new int[dim1][dim2][dim3];

        System.out.println("\nEnter elements for the simulated 4D array:");
        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {
                System.out.printf("Enter elements for a[%d][%d] (3D array):\n", i, j);
                for (int k = 0; k < dim3; k++) {
                    System.out.printf("Enter element for a[%d][%d][%d]: ", i, j, k);
                    a[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("\nSimulated 4D array elements:");
        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {
                System.out.printf("a[%d][%d] (3D array):\n", i, j);
                for (int k = 0; k < dim3; k++) {
                    System.out.printf("  a[%d][%d][%d] = %d\n", i, j, k, a[i][j][k]);
                }
            }
        }


    }
}
