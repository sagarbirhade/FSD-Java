import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductComparator {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.00, 4.5));
        products.add(new Product("Phone", 800.00, 4.8));
        products.add(new Product("Headphones", 50.00, 4.2));
        products.add(new Product("Tablet", 300.00, 4.0));


        System.out.println("Unsorted list:");
        for (Product product : products) {
            System.out.println(product);
        }


        Collections.sort(products, new PriceComparator());

        System.out.println("\nSorted by price:");
        for (Product product : products) {
            System.out.println(product);
        }


        Collections.sort(products, new RatingComparator().reversed());

        System.out.println("\nSorted by rating (descending):");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

class Product {
    private String name;
    double price;
    double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", rating=" + rating + "]";
    }
}

class PriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.price, p2.price);
    }
}

class RatingComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p2.rating, p1.rating);
    }
}
