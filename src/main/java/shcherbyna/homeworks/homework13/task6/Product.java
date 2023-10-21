package shcherbyna.homeworks.homework13.task6;

import java.time.LocalDate;

public class Product {

    private int id;
    private final String type;
    private final double price;
    private final boolean discount;
    private final LocalDate date;

    public Product(String type, int price, boolean discount, LocalDate date, int id) {
        this.type = type;
        if (discount){
            this.price = price * 0.9;
        } else this.price = price;
        this.discount = discount;
        this.date = date;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public boolean isDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ", Price: " + getPrice() + " uah, discount: " + isDiscount() + ", Create date: " + getDate();
    }
}
