public class Rectangle {
    private float height;
    private float width;

    public Rectangle() {
        super();
    }
    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public double getPerimeter(){
        return (height + width) * 2;
    }

    public double getArea(){
        return height * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
