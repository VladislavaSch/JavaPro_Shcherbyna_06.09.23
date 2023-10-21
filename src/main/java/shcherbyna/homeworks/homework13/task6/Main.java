package shcherbyna.homeworks.homework13.task6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 200, true, LocalDate.of(2023, 10, 1), 12562));
        products.add(new Product("Notebook", 200, false,LocalDate.of(2021, 9, 5), 25698));
        products.add(new Product("Pen", 30, false,LocalDate.of(2023, 6, 12), 45879));
        products.add(new Product("Pencil", 20, true, LocalDate.of(2022, 10, 5),56297));
        products.add(new Product("Notebook", 150, true,LocalDate.of(2023,9,30),58965));
        products.add(new Product("Book", 1500, true, LocalDate.of(2023, 10,2),85954));
        products.add(new Product("Pen", 50, false, LocalDate.of(2022,8,12),58965));
        products.add(new Product("Notebook", 400, false, LocalDate.of(2023, 7,11),56984));
        products.add(new Product("Book", 800, false, LocalDate.of(2023,10,6),56987));
        products.add(new Product("Notebook", 450, true, LocalDate.of(2023,9,25),45654));

        System.out.println(groupProductsByType(products));

        Map<String, List<Product>> groupedProducts = groupProductsByType(products);
        groupedProducts.forEach((type, typeProducts) -> {
            System.out.println(type);
            typeProducts.forEach(product -> {
                System.out.println("\tId: " + product.getId() + ", Price: " + product.getPrice() + ", Discount: " + product.isDiscount() + ", Date: " + product.getDate());
            });
        });
    }
    public static Map<String, List<Product>> groupProductsByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}
