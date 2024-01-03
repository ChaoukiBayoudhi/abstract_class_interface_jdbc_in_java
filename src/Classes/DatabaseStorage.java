package Classes;

import interfaces.Persistable;

import java.util.List;
import java.util.Optional;

public class DatabaseStorage implements Persistable {
    @Override
    public void save(Vehicle vehicle) {

    }

    @Override
    public void update(int id, Vehicle newVehicle) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Vehicle> getAll() {
        return null;
    }

    @Override
    public Optional<Vehicle> findById(int id) {
        return Optional.empty();
    }
}
