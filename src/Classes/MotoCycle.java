package Classes;

import interfaces.FuelConsumable;

public class MotoCycle extends Vehicle implements FuelConsumable{
    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }

        @Override
        public double calculateFuelEfficiency() {
            return 0;
        }


}
