package Classes;

import interfaces.FuelConsumable;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class MotoCycle extends Vehicle implements FuelConsumable{
     int nbWheels;

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }

        @Override
        public double calculateFuelEfficiency() {
            return 0;
        }


}
