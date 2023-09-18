package shcherbyna.homeworks.homework8;

public class Main {
    public static void main(String[] args) {


        Triangle triangle = new Triangle(5, 6);
        Circle circle = new Circle(9);
        Square square = new Square(4.2);


        System.out.println(triangle.calculateArea());
        System.out.println(circle.calculateArea());
        System.out.println(square.calculateArea());

        System.out.println(triangle.calculateArea() + circle.calculateArea() + square.calculateArea());


    }


}
