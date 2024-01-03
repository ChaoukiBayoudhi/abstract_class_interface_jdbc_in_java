package Classes;

import interfaces.FuelConsumable;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class Car extends Vehicle implements FuelConsumable {
    private int nbDoors;
    private int nbChairs;
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public double calculateFuelEfficiency() {
        return 0;
    }
}
