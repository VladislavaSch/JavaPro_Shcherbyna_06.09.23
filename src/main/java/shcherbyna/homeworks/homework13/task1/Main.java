package shcherbyna.homeworks.homework13.task1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 200));
        products.add(new Product("Notebook", 200));
        products.add(new Product("Pen", 30));
        products.add(new Product("Pencil", 20));
        products.add(new Product("Notebook", 150));
        products.add(new Product("Book", 1500));
        products.add(new Product("Pen", 50));
        products.add(new Product("Notebook", 400));
        products.add(new Product("Book", 800));
        products.add(new Product("Notebook", 450));

        List<Product> books = products.stream()
                .filter(product -> Objects.equals(product.getType(), "Book"))
                .filter(product -> product.getPrice() >= 250)
                .toList();

        System.out.println(books);

    }
}
