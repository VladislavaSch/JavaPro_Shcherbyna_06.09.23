package shcherbyna.homeworks.homework13.task4_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 200, true, LocalDate.of(2023, 10, 1)));
        products.add(new Product("Notebook", 200, false,LocalDate.of(2021, 9, 5)));
        products.add(new Product("Pen", 30, false,LocalDate.of(2023, 6, 12)));
        products.add(new Product("Pencil", 20, true, LocalDate.of(2022, 10, 5)));
        products.add(new Product("Notebook", 150, true,LocalDate.of(2023,9,30)));
        products.add(new Product("Book", 1500, true, LocalDate.of(2023, 10,2)));
        products.add(new Product("Pen", 50, false, LocalDate.of(2022,8,12)));
        products.add(new Product("Notebook", 400, false, LocalDate.of(2023, 7,11)));
        products.add(new Product("Book", 800, false, LocalDate.of(2023,10,6)));
        products.add(new Product("Notebook", 450, true, LocalDate.of(2023,9,25)));
// task 4
        List <Product> latestProducts = getThreeLatestProducts(products);
        System.out.println(latestProducts);
// task 5
        double totalcost = calculateTotalCost(products, 800, "Book");
        System.out.println(totalcost);
    }


    public static List<Product> getThreeLatestProducts(List<Product> products) {
        return products.stream()
                .sorted((p1, p2) -> p2.getDate().compareTo(p1.getDate()))
                .limit(3)
                .toList();
    }
    public static double calculateTotalCost(List<Product> products, double price, String type) {
        LocalDate currentYearStart = LocalDate.now().withDayOfYear(1);
        return products.stream()
                .filter(product -> product.getDate().isAfter(currentYearStart))
                .filter(product -> product.getType().equals(type))
                .filter(product -> product.getPrice() <= price)
                .mapToDouble(Product::getPrice)
                .sum();

    }
}
