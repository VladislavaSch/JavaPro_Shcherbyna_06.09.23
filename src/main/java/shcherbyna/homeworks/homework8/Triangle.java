package shcherbyna.homeworks.homework8;

public class Triangle implements FigureArea {

    private final double side;
    private final double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return 0.5 * side * height;
    }
}
