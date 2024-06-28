package Arrays;

public class ArrrayDemo {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 78;

        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.print(i+" ");
        }

        char c[] = new char[5];
        c[0] = 's';
        c[1] = '$';
        c[2] = '*';
        c[3] = '#';
        System.out.println();
        System.out.println("Character Array");
        for(char i : c){
            System.out.print(i+" ");
        }
    }
}
