package Storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapProductStorage implements ProductStorage{
    private Map<Long, Product> products = new HashMap<Long, Product>();

    @Override
    public Optional<Product> findById(long id) {
        Optional<Product> result = Optional.ofNullable(products.get(id));
        if(!result.isPresent()){System.out.println("No such product");}
        return result;
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void deleteById(long id) {
        products.remove(id);
    }
}
