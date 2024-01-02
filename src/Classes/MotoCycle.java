package Classes;

import interfaces.FuelConsumable;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class MotoCycle extends Vehicle implements FuelConsumable{
    private int nbWheels;

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }

        @Override
        public double calculateFuelEfficiency() {
            return 0;
        }


}
