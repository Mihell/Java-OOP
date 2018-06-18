/*
Написать классы:
        Point (точка).
        Свойства: x, y.
        Line (линия).
        Свойства: начальная точка, конечная точка.
        Методы: подсчет длины линии.
        Lines (линии).
        Свойства: список линий.
        Методы: добавление линии, суммарная длина всех линий, нахождение самой длинной линии.
        Клиентский класс LineRunner: протестировать функционал предыдущих классов.
*/

public class LineRunner {
    public static void main(String[] args) {
        Point a = new Point(23, -10);
        Point b = new Point(8, 23);
        Point c = new Point(-5, 25);
        Point d = new Point(12, -6);
        Point e = new Point(-7, 7);
        Point f = new Point(4, 8);
        Line aB = new Line(a, b);
        Line cD = new Line(c, d);
        Line eF = new Line(e, f);
        Lines lines = new Lines();
        lines.addLine(aB);
        lines.addLine(cD);
        lines.addLine(eF);
        System.out.println("Longest line =  " + lines.getLongestLine());
        System.out.println("ab length = " + aB.getLength());
        System.out.println("cd length = " + cD.getLength());
        System.out.println("ef length = " + eF.getLength());
        System.out.println("Total length = " + lines.getTotalLength());
    }
}

/*
out:
        Longest line =  Line{startPoint=Point{x=23.0, y=-10.0}, endPoint=Point{x=8.0, y=23.0}}
        ab length = 36.24913792078372
        cd length = 35.35533905932738
        ef length = 11.045361017187261
        Total length = 82.64983799729835

        Process finished with exit code 0
*/
