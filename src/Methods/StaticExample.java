package Methods;


public class StaticExample {
    int a = 10;
    static int b = 20;

    void show(){
        System.out.println("This is normal method");
    }
    static void display(){
        System.out.println("this is static method");
    }
    public static void main(String[] args) {
        StaticExample s1 = new StaticExample();
        System.out.println(s1.a);
        System.out.println(b);

        s1.show();
        display();

    }
}
