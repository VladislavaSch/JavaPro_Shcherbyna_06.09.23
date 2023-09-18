package shcherbyna.homeworks.homework8;

public interface AreaSum {
    static void calculateSum(FigureArea[] figures) {
            double totalArea = 0.0;
            for (FigureArea figure : figures) {
                totalArea += figure.calculateArea();
            }
            System.out.println("Total area: " + totalArea);
    }
}
