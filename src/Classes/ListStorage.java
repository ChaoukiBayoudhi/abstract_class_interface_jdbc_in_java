package Classes;

import interfaces.Persistable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListStorage implements Persistable {
    private List<Vehicle> vehicles= new ArrayList<>();
    @Override
    public void save(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public void update(int id, Vehicle newVehicle) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Object> getAll() {
        return null;
    }

    @Override
    public Optional<Object> findById(int id) {
        return Optional.empty();
    }
}
