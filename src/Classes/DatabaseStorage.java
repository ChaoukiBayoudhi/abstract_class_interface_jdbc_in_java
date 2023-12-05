package Classes;

import interfaces.Persistable;

import java.util.List;
import java.util.Optional;

public class DatabaseStorage implements Persistable {
    @Override
    public void save() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

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
