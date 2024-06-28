package Arrays;
import java.util.Scanner;
public class CreateEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int cnt = 0;
        do {
            System.out.println("Enter Number: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                cnt++;
                for (int i = cnt; i <= cnt; i++) {
                    arr[i] = num;
                    System.out.println("number inserted");
                    System.out.println("Array: ");
                    for(int j = 0; j<=cnt; j++){
                        System.out.println(j+" ");
                    }
                }
            } else {

                System.out.println("not inserted");
            }
        } while (cnt != arr.length);

    }



}
