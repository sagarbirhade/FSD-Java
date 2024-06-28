package Methods;

public class Numbers {
    public static void main(String[] args) {
        Numbers n1 = new Numbers();
        n1.addNumbers(1,2);
        n1.addNumbers(1,2,3);
        n1.addNumbers(12.4,4,5);

        System.out.println("--------------------");
        System.out.println("Static Methods");
        System.out.println(n1.addNumbers(12.5,13.5));
        System.out.println(addNumbers(12.6, 56.5));
        System.out.println(Numbers.addNumbers(12.8,34.5));

    }
    public int addNumbers(int a , int b){
        return a + b;
    }
    public int addNumbers(int a, int b, int c){
        return a + b + c;
    }
    public String addNumbers(double a, int b, int c){
        return "Hello Hrushi";
    }
    public static double addNumbers(double a, double b){
        return a + b;
    }
}
