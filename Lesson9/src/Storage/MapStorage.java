package Storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapStorage<T extends Entity<ID>, ID> implements Storage<T, ID> {
    private Map<ID, T> products = new HashMap<ID, T>();

    @Override
    public Optional<T> findById(ID id) {
        Optional<T> result = Optional.ofNullable(products.get(id));
        if(!result.isPresent()){System.out.println("No such product");}
        return result;
    }

    @Override
    public void save(T entity) {
        products.put(entity.getId(), entity);
    }

    @Override
    public void deleteById(ID id) {
        products.remove(id);
    }
}
