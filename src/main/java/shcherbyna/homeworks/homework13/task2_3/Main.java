package shcherbyna.homeworks.homework13.task2_3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 200, true));
        products.add(new Product("Notebook", 200, false));
        products.add(new Product("Pen", 30, false));
        products.add(new Product("Pencil", 20, true));
        products.add(new Product("Notebook", 150,true));
        products.add(new Product("Book", 1500,true));
        products.add(new Product("Pen", 50, false));
        products.add(new Product("Notebook", 400, false));
        products.add(new Product("Book", 800, false));
        products.add(new Product("Notebook", 450,true));
// task 2
        List<Product> booksWithDiscount = withDiscount(products);
        System.out.println(booksWithDiscount);
// task 3
        try {
            Product cheapeast = findCheapest(products, "Book");
            System.out.println(cheapeast);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
    public static List<Product> withDiscount (List<Product> list){
        return list.stream()
                .filter(product -> Objects.equals(product.getType(), "Book"))
                .filter(Product::isDiscount)
                .toList();
    }
    public static Product findCheapest(List<Product> products, String type) {
        return products.stream()
                .filter(product -> product.getType().equals(type))
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow(() -> new RuntimeException("Продукт " + type + " не знайдено"));
    }
}
