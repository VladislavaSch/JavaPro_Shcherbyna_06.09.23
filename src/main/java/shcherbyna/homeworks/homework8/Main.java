package shcherbyna.homeworks.homework8;

public class Main {
    public static void main(String[] args) {

        FigureArea [] figures = new FigureArea[] {
                new Circle(4.5),
                new Triangle(5,9),
                new Square(7.9)
        };

        int counter = 1;

        for (FigureArea figureArea: figures) {
            System.out.println("Area of figure " + counter + " = " + figureArea.calculateArea());
            counter++;
        }

        AreaSum.calculateSum(figures);

    }
}
