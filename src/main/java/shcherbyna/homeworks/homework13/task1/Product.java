package shcherbyna.homeworks.homework13.task1;


public class Product {
    private final String type;
    private final double price;

    public Product(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ", Price: " + getPrice() + " грн.";
    }
}
