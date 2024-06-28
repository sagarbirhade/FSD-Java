package Abstraction.Interface.VehicleExample;

public class Truck implements  Vehicle{


    @Override
    public void engineCapacity() {
        System.out.println("Engine capacity truck: 5000cc");
    }

    @Override
    public void efficiency() {
        System.out.println("Milage of truck: 25km/hr");

    }

    @Override
    public void vehicleCost() {
        System.out.println("Truck cost: 2500000");

    }

    @Override
    public void maintainance() {
        System.out.println("Truck maintainance: 50000");

    }
}
