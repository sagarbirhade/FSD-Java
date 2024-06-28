package Inheritance;

public class Bike extends Vehicle {
    void bEngine(){
        System.out.println("Bike has 150 cc engine");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.engine();
        v.wheels();


        Bike b = new Bike();
        b.bEngine();
        b.engine();
        b.wheels();

        Vehicle v1 = new Bike();
        v1.engine();
        v1.wheels();


    }
}
