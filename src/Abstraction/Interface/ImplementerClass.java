package Abstraction.Interface;

public class ImplementerClass implements FirstInterface{

    @Override
    public void display() {
        System.out.println("Overrided display() method of FirstInterface");
    }

    public static void main(String[] args) {
        ImplementerClass c1 = new ImplementerClass();
        FirstInterface.printDetails(); // can call it as static method
    }
}
