package shcherbyna.homeworks.homework13.task4_5;

import java.time.LocalDate;

public class Product {
    private final String type;
    private final double price;
    private final boolean discount;
    private final LocalDate date;

    public Product(String type, int price, boolean discount, LocalDate date) {
        this.type = type;
        if (discount){
            this.price = price * 0.9;
        } else this.price = price;
        this.discount = discount;
        this.date = date;
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

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ", Price: " + getPrice() + " грн.";
    }
}
