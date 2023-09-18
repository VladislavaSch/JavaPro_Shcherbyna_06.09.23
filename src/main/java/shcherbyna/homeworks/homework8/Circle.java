package shcherbyna.homeworks.homework8;

public class Circle implements FigureArea {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius;
    }
}
