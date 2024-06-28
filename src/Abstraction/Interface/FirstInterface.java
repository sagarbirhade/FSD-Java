package Abstraction.Interface;

public interface FirstInterface {
    int a = 20; // -->public static final int a = 20
    static int b = 50;
    void display(); //public final void display();

    private void show(){
        // private method has body
        System.out.println("private show() method of FirstInterface");
    }
    static void printDetails(){
        // static method has body
        System.out.println("static method printDetails() of FirstInterface");
    }

    public static void main(String[] args) {
        System.out.println(a);
        FirstInterface f1 = new FirstInterface() {
            @Override
            public void display() {
                System.out.println(" override display() method of FirstInterface");
            }
        };
        f1.display();
    }
}
