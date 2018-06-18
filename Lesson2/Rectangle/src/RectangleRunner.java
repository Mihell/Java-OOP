/*
Написать классы:
        Rectangle (прямоугольник).
        Свойства: ширина, высота.
        Методы: подсчет периметра, подсчет площади.
        Rectangles (прямоугольники).
        Свойства: список прямоугольников.
        Методы: добавление прямоугольника, подсчет суммарной площади всех прямоугольников.
        Клиентский класс RectangleRunner: протестировать функционал предыдущих классов.
*/

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(10, 4);
        Rectangle secondRectangle = new Rectangle(5, 6);
        Rectangles rectangles = new Rectangles();
        rectangles.addRectangle(firstRectangle);
        rectangles.addRectangle(secondRectangle);
        System.out.println(rectangles.getTotalArea());
    }
}

/*out:
70.0
Process finished with exit code 0*/

