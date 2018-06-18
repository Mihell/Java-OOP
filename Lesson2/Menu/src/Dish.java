public class Dish {
    private final String name;
    private final String description;
    private final long price;

    public Dish(String name, String description, long price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public long getPrice() {
        return this.price;
    }
    public String toString() {
        return "[Name = " + this.name + ", description = " + this.description + ", price = " + this.price + "]";
    }
}
