package Abstraction.Interface.VehicleExample;

public class Bike implements Vehicle{


    @Override
    public void engineCapacity() {
        System.out.println("Engine capacity bike: 350cc");
    }

    @Override
    public void efficiency() {
        System.out.println("Milage of bike: 45km/hr");

    }

    @Override
    public void vehicleCost() {
        System.out.println("Truck cost: 200000");

    }

    @Override
    public void maintainance() {
        System.out.println("Truck maintainance: 25000");

    }
}
