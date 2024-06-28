package Polymorphism;

public class Bike extends Vehicle {


    @Override
    void wheel(){
        System.out.println("Wheel method of Bike class");
       // super.wheel();
    }

    void brakes(){
        System.out.println("brakes method of Bike class");
        super.wheel();
    }

    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.wheel();
        b1.brakes();
        Vehicle.engine();




    }
}
