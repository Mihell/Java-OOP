public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        super();
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double getLength() {
        double height = endPoint.getY() - startPoint.getY();
        double width = endPoint.getX() - startPoint.getX();
        return Math.sqrt(height * height + width * width);
    }

    @Override
    public String toString() {
        return "Line{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }
}
