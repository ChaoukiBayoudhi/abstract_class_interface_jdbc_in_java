package Classes;

import interfaces.FuelConsumable;

public class Car extends Vehicle implements FuelConsumable {
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public double calculateFuelEfficiency() {
        return 0;
    }
}
