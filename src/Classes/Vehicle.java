package Classes;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
//
@FieldDefaults(level = AccessLevel.PRIVATE)
//the @FieldDefaults annotation will add the private access level to all the fields
public abstract class Vehicle {

    //the id is auto generated as Identity
    //the first add vehicle will have id = 1
    //the second add vehicle will have id = 2
    //and so on
    int id;
    static int lastId = 0;
    @EqualsAndHashCode.Include
    String name;
    String color;
    LocalDate dateOfManufacture;
    //constructor that auto generate the id
    public Vehicle() {
        this.id = ++lastId;
    }
    public void start() {
        System.out.println("Engine started");
    }
    public abstract void stop();
}
