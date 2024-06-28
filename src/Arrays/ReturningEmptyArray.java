package Arrays;
import java.util.Scanner;
public class ReturningEmptyArray {
    public static void main(String[] args) {
        int arr[]  = {1,2,0,5,4};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                System.out.print("Empty Index: "+i);
            }

        }
    }

}
