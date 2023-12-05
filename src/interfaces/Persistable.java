package interfaces;

import java.util.List;
import java.util.Optional;

public interface Persistable {
    void save();
    void update();
    void delete();
    List<Object> getAll();
    Optional<Object> findById(int id);
}
