public class MenuRunner {
    public static void main(String[] args) {
        Dish firstDish = new Dish("Borsch", "Ukrainian national dish", 10);
        Dish secondDish = new Dish("Cake", "sweet dish", 20);
        Dish thirdDish = new Dish("Pizza", "national Italian dish", 15);
        Dish fourthDish = new Dish("Sushi", "Japan national dish", 25);
        Dish fifthDish = new Dish("Honey", "It's good with tea", 12);
        Dish sixthDish = new Dish("Ice cream", "cold and sweet", 8);
        Menu cafeMenu = new Menu("Cafe");
        Menu restaurantMenu = new Menu("Restaurant");
        restaurantMenu.addDish(firstDish);
        restaurantMenu.addDish(fourthDish);
        restaurantMenu.addDish(thirdDish);
        cafeMenu.addDish(secondDish);
        cafeMenu.addDish(fifthDish);
        cafeMenu.addDish(sixthDish);
        System.out.println(restaurantMenu.getCheapestDish());
        System.out.println(cafeMenu.getCheapestDish());
    }
}
