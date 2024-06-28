package Methods;

public class Example {
    int a = 10;
    static int b = 20;
    Example(){
        System.out.println("Constructor");
    }
    {
        System.out.println("Instance block 1");
    }
    static{
        System.out.println("Static block");
    }
    {
        System.out.println("Instance block 2");
    }
    static void display(){
        System.out.println("display method");
    }

    public static void main(String[] args) {
        Example e1 = new Example();

    }
}
