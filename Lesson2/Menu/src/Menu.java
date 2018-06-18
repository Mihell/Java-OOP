import java.util.ArrayList;

public class Menu {
    private final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addDish(Dish dish) {
        this.dishes.add(dish);
    }
    public Dish getCheapestDish() {
        if(dishes.size() == 0){
            return null;
        } else{
            Dish cheapestDish = dishes.get(0);
            for(Dish dish : dishes){
                cheapestDish = (dish.getPrice() < cheapestDish.getPrice()) ? dish : cheapestDish;
            }
            return cheapestDish;
        }
    }
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", dishes=" + dishes +
                '}';
    }
}
