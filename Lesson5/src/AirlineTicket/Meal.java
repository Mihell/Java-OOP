package AirlineTicket;

public class Meal {
    private String foodType;
    private boolean isDrink;
    private int price;

    public Meal() {
    }

    public Meal(String foodType, boolean isDrink, int price) {

        this.foodType = foodType;
        this.isDrink = isDrink;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "foodType='" + foodType + '\'' +
                ", isDrink=" + isDrink +
                ", price=" + price +
                '}';
    }
}
