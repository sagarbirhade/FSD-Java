package Abstraction.Interface.VehicleExample;

public class Car implements  Vehicle{

    @Override
    public void engineCapacity() {
        System.out.println("Engine capacity car: 25000cc");
    }

    @Override
    public void efficiency() {
        System.out.println("Milage of car: 30km/hr");

    }

    @Override
    public void vehicleCost() {
        System.out.println("Truck cost: 1000000");

    }

    @Override
    public void maintainance() {
        System.out.println("Truck maintainance: 20000");

    }
}
