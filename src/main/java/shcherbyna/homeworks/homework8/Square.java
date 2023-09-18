package shcherbyna.homeworks.homework8;

public class Square implements FigureArea{

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
