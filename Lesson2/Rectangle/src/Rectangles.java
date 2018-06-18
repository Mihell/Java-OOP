import java.util.ArrayList;

public class Rectangles {
    private ArrayList<Rectangle> rectangles = new ArrayList<>();

    public Rectangles() {
        super();
    }

    public void addRectangle(Rectangle rectangle){
        rectangles.add(rectangle);
    }

    public double getTotalArea(){
        double totalArea = 0;
        for(Rectangle rectangle : rectangles){
            totalArea += rectangle.getArea();
        }
        return totalArea;
    }

    @Override
    public String toString() {
        return "Rectangles{" +
                "rectangles=" + rectangles +
                '}';
    }
}
