package interfaces;

import Classes.Vehicle;

import java.util.List;
import java.util.Optional;

public interface Persistable {
    void save(Vehicle vehicle);
    void update(int id, Vehicle newVehicle);
    void delete(int id);
    List<Object> getAll();
    Optional<Object> findById(int id);
}
