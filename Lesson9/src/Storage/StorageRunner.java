package Storage;

import java.util.Optional;

public class StorageRunner {
    public static void main(String[] args) {
        ProductStorage productStorage = new MapProductStorage();

        productStorage.save(new Product(11, "MacBook", "Apple's notebook", 2000));
        productStorage.save(new Product(15, "Lenovo", "Lenovo's notebook", 1500));

        Optional<Product> product = productStorage.findById(11L);
        if (product.isPresent()) {
            System.out.print(product.get()); // Product{id=11, name='MacBook', description='Apple's notebook', price=2000}
        }
        System.out.println(productStorage.findById(12L));

        System.out.println("Now with generic types:");
        Storage<Product, Long> mapStorage = new MapStorage<Product, Long>();
        productStorage.save(new Product(11, "MacBook", "Apple's notebook", 2000));
        productStorage.save(new Product(15, "Lenovo", "Lenovo's notebook", 1500));

        Optional<Product> mapProduct = productStorage.findById(11L);
        if (mapProduct.isPresent()) {
            System.out.print(mapProduct.get()); // Product{id=11, name='MacBook', description='Apple's notebook', price=2000}
        }
        System.out.print(productStorage.findById(12L));

    }
}
