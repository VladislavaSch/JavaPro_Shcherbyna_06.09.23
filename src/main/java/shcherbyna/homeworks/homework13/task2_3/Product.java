package shcherbyna.homeworks.homework13.task2_3;

public class Product {
    private final String type;
    private final double price;
    private final boolean discount;

    public Product(String type, int price, boolean discount) {
        this.type = type;
        if (discount){
            this.price = price * 0.9;
        } else this.price = price;
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ", Price: " + getPrice() + " грн.";
    }
}

