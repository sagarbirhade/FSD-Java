package Constructor;

public class Copy__Constructor {
    public Copy__Constructor(int a, int b){
        System.out.println(a+b);
    }
    public Copy__Constructor(Copy__Constructor c){
        System.out.println("Copy Constructor");
    }

    public static void main(String[] args) {
        Copy__Constructor d1 = new Copy__Constructor(12,23);
        Copy__Constructor d2 = new Copy__Constructor(d1);

        

    }
}
