package Arrays;

import java.util.Arrays;

public class ArrayChanges {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();

        //  1, 7, 3, 4, 5, 6, 2
        arr[5] = arr[5] * 10;
        arr[2] = arr[2] + 50;
        arr[0] = arr[0] / 5;
        swap(arr, 1, 5);

        // 1, 7, 3, 4, 5, 2, 6
        swap(arr, 2, 4);

        swap(arr, 0, 3);

        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
