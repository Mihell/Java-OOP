package Storage;

public class Product implements Entity<Long> {
    private final long id;
    private String name;
    private String description;
    private int price;

    public Product(long id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String toString(){
        return "Product[id= " + id + ", name=" + name + ", description=" + description + ", price=" + price + "]\n";
    }
}
