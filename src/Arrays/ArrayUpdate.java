package Arrays;

public class ArrayUpdate {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};

        for (int i : arr) {
            System.out.print(i + " ");
        }

        arr[3] = arr[0] / 5;
        arr[4] = arr[2] / 5;
        arr[1] = arr[5] * 10;

        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
